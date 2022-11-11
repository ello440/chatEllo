package com.example.chatello;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HalamanPesan01 extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "MESSAGE";
    public static final String  KONTAK = "";
    public static final int TEXT_REQUEST = 1;
    private EditText editText;
    private TextView textViewMessage, penerima;
    String kontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_pesan01);
        editText = findViewById(R.id.editText);
        textViewMessage = findViewById(R.id.text_message);
        penerima = findViewById(R.id.text_header);


        Intent intent = getIntent();
        kontak = intent.getStringExtra(MainActivity.KONTAK);
        penerima.setText(kontak);
        getSupportActionBar().setTitle(kontak);
    }

    public void openSecondActivity(View view) {
        Intent intent = new Intent(HalamanPesan01.this, HalamanPesan02.class);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(KONTAK, kontak);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    protected void onActivityResult(int requestCode, int resultCode,
                                    @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST && resultCode == RESULT_OK) {
            String reply = data.getStringExtra(HalamanPesan02.EXTRA_REPLY);
            textViewMessage.setText(reply);


        }
    }
}

