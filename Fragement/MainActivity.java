 package com.example.fragement;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

 public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
FrameLayout frm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrame(new MainActivity2());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrame(new MainActivity3());
            }
        });
    }
    private void loadFrame(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fg = fm.beginTransaction();
        fg.replace(R.id.frm1,fragment);
        fg.commit();
    }
}