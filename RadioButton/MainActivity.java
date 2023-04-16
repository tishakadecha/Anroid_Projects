package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg1;
    RadioButton r1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1 = findViewById(R.id.rg1);
        button = findViewById(R.id.button);

        //display selected text after clicking button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = rg1.getCheckedRadioButtonId();
                r1 = findViewById(i);
                Toast.makeText(MainActivity.this, "You Select = "+r1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        //display selected text just check radio button button
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                r1 = findViewById(i);
                Toast.makeText(MainActivity.this, "Select = "+r1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}