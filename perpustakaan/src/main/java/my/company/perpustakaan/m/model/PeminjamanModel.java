package com.example.perpustakaan.model;

import com.google.gson.annotations.SerializedName;

public class PeminjamanModel {
    @SerializedName("id_pinjam")         public String idPinjam;
    @SerializedName("anggota_id")        public String anggotaId;
    @SerializedName("buku_id")           public String bukuId;
    @SerializedName("tanggal_pinjam")    public String tanggalPinjam;
    @SerializedName("tanggal_kembali")   public String tanggalKembali;
    @SerializedName("tanggal_dikembalikan") public String tanggalDikembalikan;
    @SerializedName("status")            public boolean status;
    @SerializedName("denda")             public double denda;
    @SerializedName("denda_sementara")   public double dendaSementara;
    @SerializedName("judul")             public String judulBuku;
    @SerializedName("penulis")           public String penulisBuku;
    @SerializedName("nama_anggota")      public String namaAnggota;
}
