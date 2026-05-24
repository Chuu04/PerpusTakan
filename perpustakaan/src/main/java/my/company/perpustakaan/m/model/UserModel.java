package com.example.perpustakaan.model;

import com.google.gson.annotations.SerializedName;

public class UserModel {
    @SerializedName("id")          public String id;
    @SerializedName("nama")        public String nama;
    @SerializedName("email")       public String email;
    @SerializedName("role")        public String role;
    @SerializedName("anggota_id")  public String anggotaId;
    @SerializedName("nomor_anggota") public int nomorAnggota;
    @SerializedName("alamat")      public String alamat;
    @SerializedName("telepon")     public String telepon;
    @SerializedName("nip")         public int nip;
    @SerializedName("shift_kerja") public String shiftKerja;
}