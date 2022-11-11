package com.example.chatello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String penerima;
    public static final String KONTAK = "REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void NUNEK (View view) {
        Intent page1 = new Intent(MainActivity.this, HalamanPesan01.class);
        page1.putExtra(KONTAK, "Nunek");
        startActivity(page1);
    }

    public void FREYA (View view) {
        Intent page1 = new Intent(MainActivity.this, HalamanPesan01.class);
        page1.putExtra(KONTAK, "Freya");
        startActivity(page1);
    }

    public void AZIZI (View view) {
        Intent page1 = new Intent(MainActivity.this, HalamanPesan01.class);
        page1.putExtra(KONTAK, "Azizi");
        startActivity(page1);
    }
}