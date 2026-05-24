// activity/LoginActivity.java
package com.example.perpustakaan.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import com.example.perpustakaan.MainActivity;
import com.example.perpustakaan.R;
import com.example.perpustakaan.model.*;
import com.example.perpustakaan.network.ApiClient;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText etEmail, etPassword;
    TextInputLayout tilEmail, tilPassword;
    Button btnLogin;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail     = findViewById(R.id.etEmail);
        etPassword  = findViewById(R.id.etPassword);
        tilEmail    = findViewById(R.id.tilEmail);
        tilPassword = findViewById(R.id.tilPassword);
        btnLogin    = findViewById(R.id.btnLogin);
        progressBar = findViewById(R.id.progressBar);

        btnLogin.setOnClickListener(v -> doLogin());
    }

    private void doLogin() {
        String email    = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        boolean isValid = true;
        if (email.isEmpty()) {
            tilEmail.setError(getString(R.string.error_empty_field));
            isValid = false;
        } else {
            tilEmail.setError(null);
        }

        if (password.isEmpty()) {
            tilPassword.setError(getString(R.string.error_empty_field));
            isValid = false;
        } else {
            tilPassword.setError(null);
        }

        if (!isValid) return;

        progressBar.setVisibility(View.VISIBLE);
        btnLogin.setEnabled(false);

        Map<String, String> body = new HashMap<>();
        body.put("email", email);
        body.put("password", password);

        ApiClient.getService().login(body).enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<ApiResponse<UserModel>> call,
                                   Response<ApiResponse<UserModel>> response) {
                progressBar.setVisibility(View.GONE);
                btnLogin.setEnabled(true);

                if (response.isSuccessful() && response.body() != null) {
                    ApiResponse<UserModel> res = response.body();
                    if (res.isSuccess()) {
                        // Simpan data user ke SharedPreferences
                        SharedPreferences prefs = getSharedPreferences("UserPrefs", MODE_PRIVATE);
                        prefs.edit()
                             .putString("user_json", new Gson().toJson(res.getData()))
                             .putString("role", res.getData().role)
                             .apply();

                        Toast.makeText(LoginActivity.this, R.string.login_success, Toast.LENGTH_SHORT).show();

                        // Arahkan ke MainActivity
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        finish();
                    } else {
                        Toast.makeText(LoginActivity.this, res.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, R.string.server_error, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ApiResponse<UserModel>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                btnLogin.setEnabled(true);
                Toast.makeText(LoginActivity.this,
                        getString(R.string.connection_error) + ": " + t.getMessage(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
