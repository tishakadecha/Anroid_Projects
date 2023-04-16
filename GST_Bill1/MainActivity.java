package com.example.gst_bill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button total,finalbill;
    EditText qty,rate,fbill,gstrate,totans,sgst,cgst;
    int q,r,tot,gst,gsttot,finalb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total = findViewById(R.id.total);
        finalbill = findViewById(R.id.finalbill);
        qty = findViewById(R.id.qty);
        rate = findViewById(R.id.rate);
        fbill = findViewById(R.id.fbill);
        gstrate = findViewById(R.id.gstrate);
        cgst = findViewById(R.id.cgst);
        sgst = findViewById(R.id.sgst);
        totans = findViewById(R.id.totans);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q = Integer.parseInt(qty.getText().toString());
                r = Integer.parseInt(rate.getText().toString());
                tot = q * r;
                totans.setText(""+tot);
            }
        });
        finalbill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tot = Integer.parseInt(totans.getText().toString());
                r = Integer.parseInt(gstrate.getText().toString());
                gsttot = tot * r / 100;
                gst = gsttot / 2;
                sgst.setText(""+gst);
                cgst.setText(""+gst);
                finalb = tot + gsttot;
                fbill.setText(""+finalb);
            }
        });
    }
}