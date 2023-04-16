package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button registerNew,backToLogin;
    TextView txtunm,txtpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        registerNew = findViewById(R.id.registerNew);
        backToLogin = findViewById(R.id.backToLogin);
        txtpass = findViewById(R.id.txtpass);
        txtunm = findViewById(R.id.txtunm);

        Intent i1 = getIntent();
        txtunm.setText(i1.getStringExtra("unm"));
        txtpass.setText(i1.getStringExtra("pass"));

        backToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}