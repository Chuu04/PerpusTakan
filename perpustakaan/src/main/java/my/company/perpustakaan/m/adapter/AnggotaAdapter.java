package com.example.perpustakaan.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perpustakaan.R;
import com.example.perpustakaan.model.AnggotaModel;

import java.util.List;

public class AnggotaAdapter extends RecyclerView.Adapter<AnggotaAdapter.AnggotaViewHolder> {

    private List<AnggotaModel> anggotaList;
    private OnAnggotaClickListener listener;

    public interface OnAnggotaClickListener {
        void onEditClick(AnggotaModel anggota);
        void onDeleteClick(AnggotaModel anggota);
    }

    public AnggotaAdapter(List<AnggotaModel> anggotaList, OnAnggotaClickListener listener) {
        this.anggotaList = anggotaList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public AnggotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anggota, parent, false);
        return new AnggotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnggotaViewHolder holder, int position) {
        AnggotaModel anggota = anggotaList.get(position);
        holder.tvNama.setText(anggota.nama);
        holder.tvNomorAnggota.setText("No: " + anggota.nomorAnggota);
        holder.tvEmail.setText(anggota.email);

        holder.btnEdit.setOnClickListener(v -> listener.onEditClick(anggota));
        holder.btnDelete.setOnClickListener(v -> listener.onDeleteClick(anggota));
    }

    @Override
    public int getItemCount() {
        return anggotaList.size();
    }

    static class AnggotaViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvNomorAnggota, tvEmail;
        ImageButton btnEdit, btnDelete;

        public AnggotaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama         = itemView.findViewById(R.id.tvNama);
            tvNomorAnggota = itemView.findViewById(R.id.tvNomorAnggota);
            tvEmail        = itemView.findViewById(R.id.tvEmail);
            btnEdit        = itemView.findViewById(R.id.btnEdit);
            btnDelete      = itemView.findViewById(R.id.btnDelete);
        }
    }
}
