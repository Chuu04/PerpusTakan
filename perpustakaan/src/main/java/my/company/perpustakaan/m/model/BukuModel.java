package com.example.perpustakaan.model;

import com.google.gson.annotations.SerializedName;

public class BukuModel {
    @SerializedName("id_buku")   public String idBuku;
    @SerializedName("judul")     public String judul;
    @SerializedName("penulis")   public String penulis;
    @SerializedName("genre")     public String genre;
    @SerializedName("stok")      public int stok;
    @SerializedName("kategori")  public String kategori;
    @SerializedName("author")    public String author;
    @SerializedName("volume")    public int volume;
    @SerializedName("ilustrator") public String ilustrator;
}