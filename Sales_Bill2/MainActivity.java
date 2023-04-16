package com.example.sales_bill2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button r5,r12,r18,r28,datepic;
    EditText qty,rate;
    TextView cgst,sgst,total,disdate;
    int q,r,tot,r1,gst,ans,dd,mm,yy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r5 = findViewById(R.id.r5);
        r12 = findViewById(R.id.r12);
        r18 = findViewById(R.id.r18);
        r28 = findViewById(R.id.r28);
        datepic = findViewById(R.id.datepic);
        qty = findViewById(R.id.qty);
        rate = findViewById(R.id.rate);
        cgst = findViewById(R.id.cgst);
        sgst = findViewById(R.id.sgst);
        total = findViewById(R.id.total);
        disdate = findViewById(R.id.disdate);

        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            tot = salesTot(q,r,tot);
            r1 = tot * 5 /100;
            gst = r1 / 2;
            cgst.setText(""+gst);
            sgst.setText(""+gst);
            ans = tot + r1;
            total.setText(""+ans);
            }
        });
        r12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tot = salesTot(q,r,tot);
                r1 = tot * 12 /100;
                gst = r1 / 2;
                cgst.setText(""+gst);
                sgst.setText(""+gst);
                ans = tot + r1;
                total.setText(""+ans);
            }
        });
        r18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tot = salesTot(q,r,tot);
                r1 = tot * 18 /100;
                gst = r1 / 2;
                cgst.setText(""+gst);
                sgst.setText(""+gst);
                ans = tot + r1;
                total.setText(""+ans);
            }
        });
        r28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tot = salesTot(q,r,tot);
                r1 = tot * 28 /100;
                gst = r1 / 2;
                cgst.setText(""+gst);
                sgst.setText(""+gst);
                ans = tot + r1;
                total.setText(""+ans);
            }
        });
        datepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar c = Calendar.getInstance();
                dd = c.get(Calendar.DAY_OF_MONTH);
                mm = c.get(Calendar.MONTH);
                yy = c.get(Calendar.YEAR);

                DatePickerDialog dtp = new DatePickerDialog(
                MainActivity.this,

                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        disdate.setText(dayOfMonth + "-" + (monthOfYear +1) + "-" +year);
                    }
                },yy,mm,dd);
                dtp.show();
            }
        });
    }
    public int salesTot(int q1,int r1,int tot1){
        q = Integer.parseInt(qty.getText().toString());
        r = Integer.parseInt(rate.getText().toString());
        tot = q * r;
        return tot;
    }
}