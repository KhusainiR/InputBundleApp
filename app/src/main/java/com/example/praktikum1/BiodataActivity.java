package com.example.praktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BiodataActivity extends AppCompatActivity {

    //Deksripsi variabel
    TextView tvNamaValue, tvNimValue, tvProdiValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        // Inisiasi variabel
        tvNamaValue =findViewById(R.id.tvNamaValue);
        tvNimValue =findViewById(R.id.tvNimValue);
        tvProdiValue =findViewById(R.id.tvProdiValue);

        // Opsi 1: Ambil dari Bundle
        Bundle bundle = getIntent().getExtras();
        tvNamaValue.setText(bundle.getString("keyNama"));
        tvNimValue.setText(bundle.getString("keyNim"));
        tvProdiValue.setText(bundle.getString("keyProdi"));

        // opsi 2 : ambil dari Intent
//        Intent data = getIntent();
//        String nama = data.getStringExtra("keyNama");
//        String nim = data.getStringExtra("keyNim");
//        String prodi = data.getStringExtra("keyProdi");
//
//        tvNamaValue.setText(nama);
//        tvNimValue.setText(nim);
//        tvProdiValue.setText(prodi);
    }
}