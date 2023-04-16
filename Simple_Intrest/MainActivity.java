package com.example.simple_intrest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btncal;
    EditText amt,rate,year,si;
    int p,r,n,ans;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amt = findViewById(R.id.amt);
        rate = findViewById(R.id.rate);
        year = findViewById(R.id.year);
        btncal = findViewById(R.id.btncal);
        si = findViewById(R.id.si);


        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p = Integer.parseInt(amt.getText().toString());
                r = Integer.parseInt(rate.getText().toString());
                n = Integer.parseInt(year.getText().toString());
                ans = p * r * n / 100;
                si.setText(" "+ans);
            }
        });
    }
}