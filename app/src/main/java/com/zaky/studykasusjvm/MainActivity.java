package com.zaky.studykasusjvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.ExifInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText harga_barang, jumlah_barang;
    private Button button, tutup;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        harga_barang = findViewById(R.id.harga_barang);
        jumlah_barang = findViewById(R.id.jumlah_barang);
        button = findViewById(R.id.button);
        total = findViewById(R.id.total);
        tutup = findViewById(R.id.tutup);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editText1 = harga_barang.getText().toString();
                String editText2 = jumlah_barang.getText().toString();


                int editText3 = Integer.parseInt(harga_barang.getText().toString());
                int editText4 = Integer.parseInt(jumlah_barang.getText().toString());
                int hasil = editText3 * editText4;
//                total.setText(String.valueOf(hasil));
                String total = Integer.toString(hasil);

                Intent kirim = new Intent(MainActivity.this, Main2Activity.class);
                kirim.putExtra("harga", editText1);
                kirim.putExtra("jumlah", editText2);
                kirim.putExtra("total", total);
                startActivity(kirim);
            }
        });

        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Exit();
            }
        });

    }
    public void Exit(){
        finish();
    }



}
