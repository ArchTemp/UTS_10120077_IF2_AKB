package com.IhsanA_10120077_IF2.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;

import com.IhsanA_10120077_IF2.R;

/**
 * NAMA    : Mohammad Noor Ihsan Akbar
 * NIM     : 10120077
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 * Pengganti UTS AKB
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L);
    }
}

/**
 * NAMA    : Mohammad Noor Ihsan Akbar
 * NIM     : 10120077
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 * Pengganti UTS AKB
 */