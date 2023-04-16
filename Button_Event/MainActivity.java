package com.example.buttonevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn1,btn2,btn4;
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        t1 = findViewById(R.id.t1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("using Simple View onClick Listener Pattern...");
            }
        });
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
    }
    public void btn3(View view)
    {
        t1.setText("Using onClick Listener by xml code");
    }
    @Override
    public void onClick(View view) {
        if(view.getId()==btn2.getId())
        {
            t1.setText("Button - 2 onClick interface method (leader if)");
        }
        if(view.getId()==btn4.getId())
        {
            t1.setText("Button - 4 onClick interface method (leader if)");
        }
        /*
        switch (view.getId())
        {
            case R.id.btn2:
                t1.setText("Button - 2 onClick interface method (Switch case)");
            case R.id.btn4:
                t1.setText("Button - 4 onClick interface method (Switch case)");
        }*/
    }
}