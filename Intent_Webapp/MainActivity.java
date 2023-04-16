package com.example.intent_webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edpass,edunm;
    Button login,cancle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edpass = findViewById(R.id.edpass);
        edunm = findViewById(R.id.edunm);
        login = findViewById(R.id.login);
        cancle = findViewById(R.id.cancel);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String unm,pass;
                unm = edunm.getText().toString();
                pass = edpass.getText().toString();
                if(unm.equals("Tisha") && pass.equals("12345")){
                    Toast.makeText(MainActivity.this, "Welcome "+unm, Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(getApplicationContext(),MainActivity2.class);
                    i1.putExtra("unm",unm);
                    startActivity(i1);
                }
                else {
                    Toast.makeText(MainActivity.this, "OOPs dear "+unm+" You are not register.. ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edunm.setText("");
                edpass.setText("");
                Toast.makeText(MainActivity.this, "Cancel Values...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}