// app/src/main/java/com/example/perpustakaan/network/ApiClient.java
package com.example.perpustakaan.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    // ⚠️ GANTI dengan IP address komputer kamu!
    // Kalau pakai emulator Android Studio → 10.0.2.2
    // Kalau pakai HP fisik → IP WiFi komputer kamu (cek: ipconfig)
    private static final String BASE_URL = "http://192.168.1.15/perpustakaan_backend/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static ApiService getService() {
        return getClient().create(ApiService.class);
    }
}
