package com.example.perpustakaan.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perpustakaan.R;
import com.example.perpustakaan.model.BukuModel;

import java.util.List;

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.BukuViewHolder> {

    private List<BukuModel> bukuList;
    private OnBukuClickListener listener;

    public interface OnBukuClickListener {
        void onEditClick(BukuModel buku);
        void onDeleteClick(BukuModel buku);
    }

    public BukuAdapter(List<BukuModel> bukuList, OnBukuClickListener listener) {
        this.bukuList = bukuList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public BukuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buku, parent, false);
        return new BukuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BukuViewHolder holder, int position) {
        BukuModel buku = bukuList.get(position);
        holder.tvJudul.setText(buku.judul);
        holder.tvPenulis.setText(buku.penulis + " | " + buku.kategori);
        holder.tvStok.setText("Stok: " + buku.stok);

        holder.btnEdit.setOnClickListener(v -> listener.onEditClick(buku));
        holder.btnDelete.setOnClickListener(v -> listener.onDeleteClick(buku));
    }

    @Override
    public int getItemCount() {
        return bukuList.size();
    }

    static class BukuViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul, tvPenulis, tvStok;
        ImageButton btnEdit, btnDelete;

        public BukuViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul   = itemView.findViewById(R.id.tvJudul);
            tvPenulis = itemView.findViewById(R.id.tvPenulis);
            tvStok    = itemView.findViewById(R.id.tvStok);
            btnEdit   = itemView.findViewById(R.id.btnEdit);
            btnDelete = itemView.findViewById(R.id.btnDelete);
        }
    }
}
