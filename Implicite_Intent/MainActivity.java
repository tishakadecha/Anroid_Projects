package com.example.implicite_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri u1 = Uri.parse("https://leetcode.com/");
                Intent i1 = new Intent(Intent.ACTION_VIEW,u1);
                startActivity(i1);
                Toast.makeText(MainActivity.this, "Let's Go...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}