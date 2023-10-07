package com.kelompok8.twobank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signInButtonClick(View view) {
        // Intent untuk mengarahkan ke LoginActivity
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}