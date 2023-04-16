package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    Button reg,cancel;
    EditText name,edunm,edpass,mno,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        reg = findViewById(R.id.reg);
        cancel = findViewById(R.id.cancel);
        name = findViewById(R.id.name);
        edunm = findViewById(R.id.edunm);
        edpass = findViewById(R.id.edpass);
        mno = findViewById(R.id.mno);
        email = findViewById(R.id.email);

    }
}