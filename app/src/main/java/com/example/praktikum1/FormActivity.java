package com.example.praktikum1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    Button btnSimpan, btnHapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        btnSimpan = findViewById(R.id.btnSimpan);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(FormActivity.this, "Data Tersimpan", Toast.LENGTH_SHORT).show();

            }
        });

        btnHapus = findViewById(R.id.btnHapus);
        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder( FormActivity.this);
                //title
                alertDialogBuilder.setTitle("peringatan!!");
                //message
                alertDialogBuilder.setMessage("Apakah Anda Yakin untuk Menghapus Data?")
                        .setIcon(R.mipmap.ic_launcher)
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                //Create Dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                //show Dialog
                alertDialog.show();
            }
        });
    }
}