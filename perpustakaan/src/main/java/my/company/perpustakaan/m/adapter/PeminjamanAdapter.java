package com.example.perpustakaan.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perpustakaan.R;
import com.example.perpustakaan.model.PeminjamanModel;

import java.util.List;

public class PeminjamanAdapter extends RecyclerView.Adapter<PeminjamanAdapter.PeminjamanViewHolder> {

    private List<PeminjamanModel> peminjamanList;
    private OnPeminjamanClickListener listener;

    public interface OnPeminjamanClickListener {
        void onKembalikanClick(PeminjamanModel peminjaman);
    }

    public PeminjamanAdapter(List<PeminjamanModel> peminjamanList, OnPeminjamanClickListener listener) {
        this.peminjamanList = peminjamanList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PeminjamanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_peminjaman, parent, false);
        return new PeminjamanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeminjamanViewHolder holder, int position) {
        PeminjamanModel peminjaman = peminjamanList.get(position);
        holder.tvJudulBuku.setText(peminjaman.judulBuku);
        holder.tvNamaPeminjam.setText(peminjaman.namaAnggota);
        holder.tvTglPinjam.setText("Pinjam: " + peminjaman.tanggalPinjam);
        holder.tvStatus.setText(peminjaman.status ? "Kembali" : "Dipinjam");

        if (peminjaman.status) {
            holder.btnKembalikan.setVisibility(View.GONE);
        } else {
            holder.btnKembalikan.setVisibility(View.VISIBLE);
            holder.btnKembalikan.setOnClickListener(v -> listener.onKembalikanClick(peminjaman));
        }
    }

    @Override
    public int getItemCount() {
        return peminjamanList.size();
    }

    static class PeminjamanViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudulBuku, tvNamaPeminjam, tvTglPinjam, tvStatus;
        Button btnKembalikan;

        public PeminjamanViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudulBuku   = itemView.findViewById(R.id.tvJudulBuku);
            tvNamaPeminjam = itemView.findViewById(R.id.tvNamaPeminjam);
            tvTglPinjam    = itemView.findViewById(R.id.tvTglPinjam);
            tvStatus       = itemView.findViewById(R.id.tvStatus);
            btnKembalikan  = itemView.findViewById(R.id.btnKembalikan);
        }
    }
}
