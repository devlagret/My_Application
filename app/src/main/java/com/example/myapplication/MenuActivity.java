package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
public class MenuActivity  extends AppCompatActivity {
    //membuat variabel untuk menampung tampilan menu
    ImageView ivMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //mendefinisikan nilai atau memasukan nilai ke variabel 'ivmenu'
        ivMenu = findViewById(R.id.iv_menu);
        //membuat fungsi untuk mendengar atau menangkap klik dari user
        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            //membuat fungsi untuk mengganti halaman jika logo di klik
            public void onClick(View view) {
            //instansiasi dan inisiasi objek baru serta penentuan tujuan (asal, tujuan)
            Intent intent = new Intent(MenuActivity.this, MainActivity.class);
            //memulai atau mengaktifkan intent
            startActivity(intent);
            }
        });
    }}
