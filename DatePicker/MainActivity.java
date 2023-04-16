package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker datepicker;
    Button btn;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datepicker = findViewById(R.id.datepicker);
        btn = findViewById(R.id.btn);
        t1 = findViewById(R.id.t1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "";
                str += datepicker.getDayOfMonth()+"/";
                str += datepicker.getMonth()+1+"/";
                str += datepicker.getYear();
                t1.setText(str);
            }
        });
    }
}