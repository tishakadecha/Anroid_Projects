package com.example.arithmeticoperation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnclearall,btnadd,btnminus,btnmulti,btndiv;
    EditText ed1,ed2;
    TextView tvans;
    int a,b,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclearall = findViewById(R.id.btnclearall);
        btnadd = findViewById(R.id.btnadd);
        btnminus = findViewById(R.id.btnminus);
        btnmulti = findViewById(R.id.btnmulti);
        btndiv = findViewById(R.id.btndiv);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        tvans = findViewById(R.id.tvans);

        btnclearall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ok it Clears Textboxes",Toast.LENGTH_SHORT).show();
                ed1.setText("0");
                ed2.setText("0");
                tvans.setText("");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This is an Addition",Toast.LENGTH_SHORT).show();
                a = Integer.parseInt(ed1.getText().toString());
                b = Integer.parseInt(ed2.getText().toString());
                ans = a + b;
                tvans.setText(" "+ans);
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This is Substraction",Toast.LENGTH_SHORT).show();
                a = Integer.parseInt(ed1.getText().toString());
                b = Integer.parseInt(ed2.getText().toString());
                ans = a - b;
                tvans.setText(" "+ans);
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This is Multiplication",Toast.LENGTH_SHORT).show();
                a = Integer.parseInt(ed1.getText().toString());
                b = Integer.parseInt(ed2.getText().toString());
                ans = a * b;
                tvans.setText(" "+ans);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This is Division",Toast.LENGTH_SHORT).show();
                a = Integer.parseInt(ed1.getText().toString());
                b = Integer.parseInt(ed2.getText().toString());
                try {
                    ans = a / b;
                }
                catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Devide By Zero Exception..",Toast.LENGTH_SHORT).show();
                }
                tvans.setText(" "+ans);
            }
        });
    }
}