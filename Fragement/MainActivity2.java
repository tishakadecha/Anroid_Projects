package com.example.fragement;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity2 extends Fragment {

    View view;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle saBundle){
        view = inflater.inflate(R.layout.activity_main2,container,false);
        return view;
    }
}