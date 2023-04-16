package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login,cancel;
    static EditText edunm,edpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        cancel = findViewById(R.id.cancel);
        edpass = findViewById(R.id.edpass);
        edunm = findViewById(R.id.edunm);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String unm = edunm.getText().toString();
                String pass = edpass.getText().toString();
                Intent i1 = new Intent(getApplicationContext(),MainActivity2.class);
                i1.putExtra("unm",unm);
                i1.putExtra("pass",pass);
                startActivity(i1);
                Toast.makeText(MainActivity.this, "Login Click", Toast.LENGTH_SHORT).show();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edunm.setText("");
                edpass.setText("");
                Toast.makeText(MainActivity.this, "Ok! Login Cancel", Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void newuser(View view)
    {
        Toast.makeText(this, "Hello New User...", Toast.LENGTH_SHORT).show();
    }
}