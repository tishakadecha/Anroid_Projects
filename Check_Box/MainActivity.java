package com.example.check_box;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1,ch2,ch3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "";
                if(ch1.isChecked()) {
                    msg += " Android ";
                }
                if(ch2.isChecked()) {
                    msg += " Advance Python ";
                }
                if(ch3.isChecked()) {
                    msg += " DWDM ";
                }
                Toast.makeText(getApplicationContext(),"You Select : "+msg,Toast.LENGTH_LONG).show();
            }
        });
    }
}