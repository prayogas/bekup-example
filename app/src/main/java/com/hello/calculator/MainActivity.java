package com.hello.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prosestambah(View view) {
        //mendeklarasi edit text pertama
        EditText nilaipertamajava = (EditText) findViewById(R.id.nilai1);
        EditText nilaikeduajava = (EditText) findViewById(R.id.nilai2);
        TextView hasiljava = (TextView) findViewById(R.id.hasil);

        double hasil;

        double nilai1 = Double.parseDouble(nilaipertamajava.getText().toString());
        double nilai2 = Double.parseDouble(nilaikeduajava.getText().toString());

        hasil = nilai1 + nilai2;

        hasiljava.setText(String.valueOf(hasil));


    }
    public void proseskurang(View view) {
        //mendeklarasi edit text pertama
        EditText nilaipertamajava = (EditText) findViewById(R.id.nilai1);
        EditText nilaikeduajava = (EditText) findViewById(R.id.nilai2);
        TextView hasiljava = (TextView) findViewById(R.id.hasil);

        double hasil;

        double nilai1 = Double.parseDouble(nilaipertamajava.getText().toString());
        double nilai2 = Double.parseDouble(nilaikeduajava.getText().toString());

        hasil = nilai1 - nilai2;

        hasiljava.setText(String.valueOf(hasil));


    }
    public void proseskali(View view) {
        //mendeklarasi edit text pertama
        EditText nilaipertamajava = (EditText) findViewById(R.id.nilai1);
        EditText nilaikeduajava = (EditText) findViewById(R.id.nilai2);
        TextView hasiljava = (TextView) findViewById(R.id.hasil);

        double hasil;

        double nilai1 = Double.parseDouble(nilaipertamajava.getText().toString());
        double nilai2 = Double.parseDouble(nilaikeduajava.getText().toString());

        hasil = nilai1 * nilai2;

        hasiljava.setText(String.valueOf(hasil));


    }
    public void prosesbagi(View view) {
        //mendeklarasi edit text pertama
        EditText nilaipertamajava = (EditText) findViewById(R.id.nilai1);
        EditText nilaikeduajava = (EditText) findViewById(R.id.nilai2);
        TextView hasiljava = (TextView) findViewById(R.id.hasil);

        double hasil;

        double nilai1 = Double.parseDouble(nilaipertamajava.getText().toString());
        double nilai2 = Double.parseDouble(nilaikeduajava.getText().toString());

        hasil = nilai1 / nilai2;

        hasiljava.setText(String.valueOf(hasil));


    }

}