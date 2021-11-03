package com.example.praktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BiodataActivity extends AppCompatActivity {

    //Deksripsi variabel
    TextView tvAlamatValue, tvHpValue, tvEmailValue, tvJenisKelaminValue, tvKelasValue, tvUkmValue;
    String getAlamat, getHp, getEmail, getProdi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        // Inisiasi variabel
        tvAlamatValue =findViewById(R.id.tvAlamatValue);
        tvHpValue =findViewById(R.id.tvHpValue);
        tvEmailValue =findViewById(R.id.tvEmailValue);
        tvJenisKelaminValue =findViewById(R.id.tvJenisKelaminValue);
        tvKelasValue =findViewById(R.id.tvKelasValue);
        tvUkmValue =findViewById(R.id.tvUkmValue);

        // Opsi 1: Ambil dari Bundle dan menampilkan data
//        Bundle bundle = getIntent().getExtras();
//        tvAlamatValue.setText(bundle.getString("keyAlamat"));
//        tvHpValue.setText(bundle.getString("keyHp"));
//        tvEmailValue.setText(bundle.getString("keyEmail"));
//        tvKelasValue.setText(bundle.getString("keyKelas"));
//
//        Intent tampilkanIntent = getIntent();
//        Bundle bukapaket = tampilkanIntent.getExtras();
//        String jk =  bukapaket.getString("keyGender");
//        String UKM = bukapaket.getString("keyUKM");
//        tvJenisKelaminValue.setText(""+jk);
//        tvUkmValue.setText(""+UKM);

        // cara ke 2
        Bundle bundle = getIntent().getExtras();
        getAlamat = bundle.getString("keyAlamat");
        getHp = bundle.getString("keyHp");
        getEmail = bundle.getString("keyEmail");
        getProdi= bundle.getString("keyProdi");

        tvAlamatValue.setText(""+getAlamat);
        tvHpValue.setText(""+getHp);
        tvEmailValue.setText(""+getEmail);
        tvKelasValue.setText(""+getProdi);

        Intent tampilkanIntent = getIntent();
        Bundle bukapaket = tampilkanIntent.getExtras();
        String jk =  bukapaket.getString("keyGender");
        String UKM = bukapaket.getString("keyUKM");
        tvJenisKelaminValue.setText(""+jk);
        tvUkmValue.setText(""+UKM);


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