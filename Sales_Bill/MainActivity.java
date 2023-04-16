package com.example.sales_bill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button total,netamt;
    EditText qty,rate,totans,discount,netans;
    int q,r,ans,dis,tot,net;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total = findViewById(R.id.total);
        netamt = findViewById(R.id.netamt);
        qty = findViewById(R.id.qty);
        rate = findViewById(R.id.rate);
        totans = findViewById(R.id.totans);
        discount = findViewById(R.id.discount);
        netans = findViewById(R.id.netans);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q = Integer.parseInt(qty.getText().toString());
                r = Integer.parseInt(rate.getText().toString());
                ans = q * r;
                totans.setText(" "+ans);
            }
        });
        netamt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = Integer.parseInt(totans.getText().toString());
                dis = Integer.parseInt(discount.getText().toString());
                tot = ans * dis / 100;
                net = ans - tot;
                netans.setText(""+net);
            }
        });
    }
}