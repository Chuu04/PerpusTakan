// app/src/main/java/com/example/perpustakaan/network/ApiService.java
package com.example.perpustakaan.network;

import com.example.perpustakaan.model.*;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.*;

public interface ApiService {

    // ── AUTH ───────────────────────────────────────────────────
    @POST("api/login.php")
    Call<ApiResponse<UserModel>> login(@Body Map<String, String> body);

    // ── BUKU ───────────────────────────────────────────────────
    @GET("api/buku.php")
    Call<ApiResponse<List<BukuModel>>> getAllBuku();

    @GET("api/buku.php")
    Call<ApiResponse<List<BukuModel>>> searchBuku(@Query("search") String keyword);

    @GET("api/buku.php")
    Call<ApiResponse<BukuModel>> getBukuById(@Query("id") String id);

    @POST("api/buku.php")
    Call<ApiResponse<Map<String, String>>> addBuku(@Body BukuModel buku);

    @PUT("api/buku.php")
    Call<ApiResponse<Object>> updateBuku(@Body BukuModel buku);

    @DELETE("api/buku.php")
    Call<ApiResponse<Object>> deleteBuku(@Query("id") String id);

    // ── ANGGOTA ────────────────────────────────────────────────
    @GET("api/anggota.php")
    Call<ApiResponse<List<AnggotaModel>>> getAllAnggota();

    @GET("api/anggota.php")
    Call<ApiResponse<AnggotaModel>> getAnggotaById(@Query("id") String id);

    @POST("api/anggota.php")
    Call<ApiResponse<Map<String, String>>> addAnggota(@Body AnggotaModel anggota);

    @PUT("api/anggota.php")
    Call<ApiResponse<Object>> updateAnggota(@Body AnggotaModel anggota);

    @DELETE("api/anggota.php")
    Call<ApiResponse<Object>> deleteAnggota(@Query("id") String id);

    // ── PEMINJAMAN ─────────────────────────────────────────────
    @GET("api/peminjaman.php")
    Call<ApiResponse<List<PeminjamanModel>>> getAllPeminjaman();

    @GET("api/peminjaman.php")
    Call<ApiResponse<List<PeminjamanModel>>> getPeminjamanAktif(@Query("aktif") String aktif);

    @GET("api/peminjaman.php")
    Call<ApiResponse<List<PeminjamanModel>>> getRiwayatAnggota(@Query("anggota_id") String id);

    @POST("api/peminjaman.php")
    Call<ApiResponse<Map<String, String>>> pinjamBuku(@Body Map<String, String> body);

    @PUT("api/peminjaman.php")
    Call<ApiResponse<Map<String, Object>>> kembalikanBuku(@Body Map<String, String> body);
}
