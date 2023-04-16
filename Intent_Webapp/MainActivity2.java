package com.example.intent_webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView user,home,meesho_career,meesho_jobs;
    EditText edurl;
    Button btn_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        user = findViewById(R.id.user);
        home = findViewById(R.id.home);
        meesho_career = findViewById(R.id.meesho_career);
        meesho_jobs = findViewById(R.id.meesho_jobs);
        edurl = findViewById(R.id.edurl);
        btn_url = findViewById(R.id.btn_url);

        Intent i1 = getIntent();
        String str = i1.getStringExtra("unm");
        user.setText("Wellcome "+str);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri u1 = Uri.parse("https://www.meesho.com/");
                Intent i1 = new Intent(Intent.ACTION_VIEW,u1);
                startActivity(i1);
            }
        });
        meesho_jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri u1 = Uri.parse("https://www.meesho.io/jobs ");
                Intent i1 = new Intent(Intent.ACTION_VIEW,u1);
                startActivity(i1);
            }
        });
        meesho_career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri u1 = Uri.parse("https://www.meesho.io/");
                Intent i1 = new Intent(Intent.ACTION_VIEW,u1);
                startActivity(i1);
            }
        });
        btn_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                url = edurl.getText().toString();
                Uri u1 = Uri.parse(url);
                Intent i1 = new Intent(Intent.ACTION_VIEW,u1);
                startActivity(i1);
            }
        });
    }
}