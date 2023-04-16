package com.example.fragement;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends Fragment {
    Button btn;
    View view;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saBundle){
        view = inflater.inflate(R.layout.activity_main3,container,false);
        return view;
    }
}