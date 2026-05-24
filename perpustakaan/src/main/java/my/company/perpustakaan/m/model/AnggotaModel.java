package com.example.perpustakaan.model;

import com.google.gson.annotations.SerializedName;

public class AnggotaModel {
    @SerializedName("id")             public String id;
    @SerializedName("anggota_id")     public String anggotaId;
    @SerializedName("nama")           public String nama;
    @SerializedName("email")          public String email;
    @SerializedName("password")       public String password;
    @SerializedName("nomor_anggota")  public int nomorAnggota;
    @SerializedName("alamat")         public String alamat;
    @SerializedName("telepon")        public String telepon;
}
