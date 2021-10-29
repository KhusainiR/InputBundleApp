package com.example.praktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel
    TextView tvNama,tvNim;
    EditText etProdi;
    Button btnSubmit, btnHapus;

//    Button btnSubmit, btnHapus;
//    EditText etNama, etNim, etHp, etEmail;
//    RadioButton rbPria, rbWanita;
//    CheckBox amcc, himaditi, koma;
//    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi variabel
        tvNama = findViewById(R.id.tvNama);
        tvNim = findViewById(R.id.tvNim);
        etProdi = findViewById(R.id.etProdi);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nama = tvNama.getText().toString();
                    String nim = tvNim.getText().toString();
                    String prodi = etProdi.getText().toString();

                    // Pengecekan prodi harus diisi
                    if (prodi.isEmpty()) {
                        Toast.makeText(getApplication(), "Program Studi harus Diisi", Toast.LENGTH_SHORT).show();
                    } else {
                        // Opsi 1: Passinf data via bundle
                        Bundle bundle = new Bundle();
                        bundle.putString("keyNama", nama);
                        bundle.putString("keyNim", nim);
                        bundle.putString("keyProdi", prodi);
                        Intent i = new Intent(MainActivity.this, BiodataActivity.class);
                        i.putExtras(bundle);
                        startActivity(i);

                        //Opsi 2: Passonf data Via Intent
//                        Intent i = new Intent(MainActivity.this, BiodataActivity.class);
//                        i.putExtra("keyNama", nama);
//                        i.putExtra("keyNim", nim);
//                        i.putExtra("keyProdi", prodi);
//                        startActivity(i);

                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "Error,TRY AGAIN!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}