package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button btn1;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        ed1 = findViewById(R.id.ed1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = ed1.getText().toString();
                Intent i1 = new Intent(getApplicationContext(),MainActivity2.class);
                i1.putExtra("str",str);
                startActivity(i1);
            }
        });
    }
}