package com.example.calulation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    Button add,minus,multi,div;
    double a,b,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        add = findViewById(R.id.add);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        t1 = findViewById(R.id.t1);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                 ans = a + b;
                 t1.setText("Addition Is = " + ans);

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                    ans = a - b;
                    t1.setText("Substraction Is = " + ans);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                    ans = a * b;
                    t1.setText("Multiplication Is = " + ans);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                ans = a / b;
                t1.setText("Division Is = " + ans);
            }
        });
    }
}