package com.zaky.studykasusjvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText harga_barang, jumlah_barang, total;
//    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn1 =(Button)findViewById(R.id.button1);
        harga_barang = findViewById(R.id.harga_barang);
        jumlah_barang = findViewById(R.id.jumlah_barang);
        total = findViewById(R.id.total);


        Intent terima = getIntent();
        String terimaHarga = terima.getStringExtra("harga");
        String terimaJumlah = terima.getStringExtra("jumlah");
        String terimaTotal = terima.getStringExtra("total");

        harga_barang.setText(terimaHarga);
        jumlah_barang.setText(terimaJumlah);
        total.setText(terimaTotal);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });


    }
}
