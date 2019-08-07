package com.example.jumlahbilanganmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText first;
    private EditText second;
    private EditText jumlah;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();

    }

    private void initUI() {
        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        button = (Button) findViewById(R.id.button);
        jumlah = (EditText) findViewById(R.id.jumlah);
    }

    private void initEvent() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah() {
        int satu = Integer.parseInt(first.getText().toString());
        int dua = Integer.parseInt(second.getText().toString());
        int total = satu + dua;
        jumlah.setText(total+"");

    }
}
