package com.example.praktikum1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class FormActivity extends AppCompatActivity  {
    EditText etAlamat, etHp, etEmail, etPassword ;
    RadioButton rbLaki, rbPerempuan;
    CheckBox cbAMCC, cbHIMADITI, cbKOMA;
    Spinner spinner;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        etAlamat = findViewById(R.id.etAlamat);
        etHp = findViewById(R.id.etHp);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        rbLaki = (RadioButton) findViewById(R.id.rbLaki);
        rbPerempuan = (RadioButton) findViewById(R.id.rbPerempuan);
        spinner = (Spinner) findViewById(R.id.spinner);
        cbAMCC = (CheckBox) findViewById(R.id.cbAMCC);
        cbHIMADITI = (CheckBox) findViewById(R.id.cbHIMADITI);
        cbKOMA = (CheckBox) findViewById(R.id.cbKOMA);
        btnSimpan = findViewById(R.id.btnSimpan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alamat = String.valueOf(etAlamat.getText().toString());
                String hp = String.valueOf(etHp.getText().toString());
                String email = String.valueOf(etEmail.getText().toString());
                String password = String.valueOf(etPassword.getText().toString());
//                String prodi = spinner.getItemAtPosition(spinner.getSelectedItemPosition()).toString();
//                bundle.putString("key2", type.getItemAtPosition(type.getSelectedItemPosition()).toString());
                String jk;
                if (rbLaki.isChecked()){
                    jk = "Laki-Laki";
                } else {
                    jk = "Perempuan";
                }
                String UKM = "";
                if (cbAMCC.isChecked()){
                    UKM += "AMCC \n";
                }
                if (cbHIMADITI.isChecked()){
                    UKM += "HIMADITI \n";
                }
                if (cbKOMA.isChecked()){
                    UKM += "KOMA";
                }


                Bundle bundle = new Bundle();
                bundle.putString("keyProdi", spinner.getItemAtPosition(spinner.getSelectedItemPosition()).toString());
                bundle.putString("keyAlamat", alamat);
                bundle.putString("keyHp", hp);
                bundle.putString("keyEmail", email);
                bundle.putString("keyPassword", password);
//                bundle.putString("keyProdi", prodi);
                bundle.putString("keyGender", jk);
                bundle.putString("keyUKM", UKM);
                Intent i = new Intent(FormActivity.this, BiodataActivity.class);
                i.putExtras(bundle);
                startActivity(i);

            }

        });

//        btnHapus = findViewById(R.id.btnHapus);
//        btnHapus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder( FormActivity.this);
//                //title
//                alertDialogBuilder.setTitle("peringatan!!");
//                //message
//                alertDialogBuilder.setMessage("Apakah Anda Yakin untuk Menghapus Data?")
//                        .setIcon(R.mipmap.ic_launcher)
//                        .setCancelable(false)
//                        .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.cancel();
//                            }
//                        });
//                //Create Dialog
//                AlertDialog alertDialog = alertDialogBuilder.create();
//                //show Dialog
//                alertDialog.show();
//            }
//        });
    }

}