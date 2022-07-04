package com.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rengwuxian.materialedittext.MaterialEditText;

public class MainActivity extends AppCompatActivity {



    MaterialEditText k_adi,password;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Giriş Yapın");
        k_adi = findViewById(R.id.k_adi);
        password = findViewById(R.id.password);
        Button btn_login = findViewById(R.id.btn_login1);

        final Kullanici kullanici1 = new Kullanici("Bahadır Kalacay","12345");
        final Kullanici kullanici2 = new Kullanici("Erkan Tanrıöver","12345");
        final Kullanici kullanici3 = new Kullanici("Ali Biçer","12345");
        final Kullanici kullanici4 = new Kullanici("Kazım Özsoy","12345");




        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String k_adi_giris = k_adi.getText().toString();
                String password_giris = password.getText().toString();

        if (k_adi_giris.equals("") || password_giris.equals("")) {
            Toast.makeText(MainActivity.this, "Tüm alanlar zorunludur", Toast.LENGTH_SHORT).show();
        }else {
            if (k_adi_giris.equals(kullanici1.getKullanici_adi()) && password_giris.equals(kullanici1.getPassword()) ||
                        k_adi_giris.equals(kullanici2.getKullanici_adi()) && password_giris.equals(kullanici2.getKullanici_adi()) ||
                        k_adi_giris.equals(kullanici3.getKullanici_adi()) && password_giris.equals(kullanici3.getPassword()) ||
                        k_adi_giris.equals(kullanici4.getKullanici_adi()) && password_giris.equals(kullanici4.getKullanici_adi()))
            {

                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Hatalı Kullanıcı Adı veya Parola", Toast.LENGTH_SHORT).show();
            }
        }
            }
        });
    }

    public MainActivity(String kullanici, String sifre){


    }

}
