// activity/BukuActivity.java — List + CRUD Buku
package com.example.perpustakaan.activity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.*;

import com.example.perpustakaan.R;
import com.example.perpustakaan.adapter.BukuAdapter;
import com.example.perpustakaan.model.*;
import com.example.perpustakaan.network.ApiClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BukuActivity extends AppCompatActivity implements BukuAdapter.OnBukuClickListener {

    RecyclerView rvBuku;
    BukuAdapter adapter;
    List<BukuModel> bukuList = new ArrayList<>();
    FloatingActionButton fabAdd;
    ProgressBar progressBar;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku);

        rvBuku      = findViewById(R.id.rvBuku);
        fabAdd      = findViewById(R.id.fabAdd);
        progressBar = findViewById(R.id.progressBar);
        searchView  = findViewById(R.id.searchView);

        adapter = new BukuAdapter(bukuList, this);
        rvBuku.setLayoutManager(new LinearLayoutManager(this));
        rvBuku.setAdapter(adapter);

        fabAdd.setOnClickListener(v -> showDialogBuku(null));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override public boolean onQueryTextSubmit(String q) { searchBuku(q); return true; }
            @Override public boolean onQueryTextChange(String q) {
                if (q.isEmpty()) loadBuku();
                return false;
            }
        });

        loadBuku();
    }

    private void loadBuku() {
        progressBar.setVisibility(View.VISIBLE);
        ApiClient.getService().getAllBuku().enqueue(new Callback<ApiResponse<List<BukuModel>>>() {
            @Override
            public void onResponse(Call<ApiResponse<List<BukuModel>>> call,
                                   Response<ApiResponse<List<BukuModel>>> response) {
                progressBar.setVisibility(View.GONE);
                if (response.isSuccessful() && response.body() != null && response.body().isSuccess()) {
                    bukuList.clear();
                    bukuList.addAll(response.body().getData());
                    adapter.notifyDataSetChanged();
                }
            }
            @Override public void onFailure(Call<ApiResponse<List<BukuModel>>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(BukuActivity.this, "Gagal memuat data", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void searchBuku(String keyword) {
        ApiClient.getService().searchBuku(keyword).enqueue(new Callback<ApiResponse<List<BukuModel>>>() {
            @Override
            public void onResponse(Call<ApiResponse<List<BukuModel>>> call,
                                   Response<ApiResponse<List<BukuModel>>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    bukuList.clear();
                    if (response.body().getData() != null) bukuList.addAll(response.body().getData());
                    adapter.notifyDataSetChanged();
                }
            }
            @Override public void onFailure(Call<ApiResponse<List<BukuModel>>> call, Throwable t) {}
        });
    }

    // ── DIALOG TAMBAH / EDIT ────────────────────────────────────
    private void showDialogBuku(BukuModel existing) {
        View view = LayoutInflater.from(this).inflate(R.layout.dialog_buku, null);

        EditText etJudul    = view.findViewById(R.id.etJudul);
        EditText etPenulis  = view.findViewById(R.id.etPenulis);
        EditText etGenre    = view.findViewById(R.id.etGenre);
        EditText etStok     = view.findViewById(R.id.etStok);
        EditText etAuthor   = view.findViewById(R.id.etAuthor);
        EditText etVolume   = view.findViewById(R.id.etVolume);
        Spinner  spKategori = view.findViewById(R.id.spKategori);

        // Isi data jika edit
        if (existing != null) {
            etJudul.setText(existing.judul);
            etPenulis.setText(existing.penulis);
            etGenre.setText(existing.genre);
            etStok.setText(String.valueOf(existing.stok));
            etAuthor.setText(existing.author);
            etVolume.setText(String.valueOf(existing.volume));
            // Set spinner
            String[] kategori = {"fiksi", "non_fiksi", "ilustrasi"};
            for (int i = 0; i < kategori.length; i++) {
                if (kategori[i].equals(existing.kategori)) {
                    spKategori.setSelection(i);
                    break;
                }
            }
        }

        new AlertDialog.Builder(this)
                .setTitle(existing == null ? "Tambah Buku" : "Edit Buku")
                .setView(view)
                .setPositiveButton("Simpan", (dialog, which) -> {
                    BukuModel buku = new BukuModel();
                    if (existing != null) buku.idBuku = existing.idBuku;
                    buku.judul    = etJudul.getText().toString();
                    buku.penulis  = etPenulis.getText().toString();
                    buku.genre    = etGenre.getText().toString();
                    buku.stok     = Integer.parseInt(etStok.getText().toString().isEmpty() ? "0" : etStok.getText().toString());
                    buku.author   = etAuthor.getText().toString();
                    buku.volume   = Integer.parseInt(etVolume.getText().toString().isEmpty() ? "1" : etVolume.getText().toString());
                    buku.kategori = spKategori.getSelectedItem().toString();

                    if (existing == null) addBuku(buku);
                    else updateBuku(buku);
                })
                .setNegativeButton("Batal", null)
                .show();
    }

    private void addBuku(BukuModel buku) {
        ApiClient.getService().addBuku(buku).enqueue(new Callback<ApiResponse<Map<String, String>>>() {
            @Override
            public void onResponse(Call<ApiResponse<Map<String, String>>> call,
                                   Response<ApiResponse<Map<String, String>>> response) {
                if (response.isSuccessful() && response.body() != null && response.body().isSuccess()) {
                    Toast.makeText(BukuActivity.this, "Buku berhasil ditambahkan", Toast.LENGTH_SHORT).show();
                    loadBuku();
                } else {
                    Toast.makeText(BukuActivity.this, "Gagal menambahkan buku", Toast.LENGTH_SHORT).show();
                }
            }
            @Override public void onFailure(Call<ApiResponse<Map<String, String>>> call, Throwable t) {
                Toast.makeText(BukuActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateBuku(BukuModel buku) {
        ApiClient.getService().updateBuku(buku).enqueue(new Callback<ApiResponse<Object>>() {
            @Override
            public void onResponse(Call<ApiResponse<Object>> call, Response<ApiResponse<Object>> response) {
                if (response.isSuccessful() && response.body() != null && response.body().isSuccess()) {
                    Toast.makeText(BukuActivity.this, "Buku berhasil diperbarui", Toast.LENGTH_SHORT).show();
                    loadBuku();
                }
            }
            @Override public void onFailure(Call<ApiResponse<Object>> call, Throwable t) {}
        });
    }

    private void deleteBuku(String id) {
        new AlertDialog.Builder(this)
                .setTitle("Hapus Buku")
                .setMessage("Yakin ingin menghapus buku ini?")
                .setPositiveButton("Hapus", (d, w) -> {
                    ApiClient.getService().deleteBuku(id).enqueue(new Callback<ApiResponse<Object>>() {
                        @Override
                        public void onResponse(Call<ApiResponse<Object>> call, Response<ApiResponse<Object>> response) {
                            if (response.isSuccessful() && response.body() != null) {
                                Toast.makeText(BukuActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                                if (response.body().isSuccess()) loadBuku();
                            }
                        }
                        @Override public void onFailure(Call<ApiResponse<Object>> call, Throwable t) {}
                    });
                })
                .setNegativeButton("Batal", null)
                .show();
    }

    // Callback dari adapter
    @Override public void onEditClick(BukuModel buku) { showDialogBuku(buku); }
    @Override public void onDeleteClick(BukuModel buku) { deleteBuku(buku.idBuku); }
}
