package com.example.google_map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.edlocation);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri u1 = Uri.parse("geo:0,0?q="+ed1.getText().toString());
                Intent i1 = new Intent(Intent.ACTION_VIEW,u1);
                i1.setPackage("com.google.android.apps.maps");
                startActivity(i1);
            }
        });
    }
}