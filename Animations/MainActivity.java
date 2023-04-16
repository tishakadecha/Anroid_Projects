package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1;
    Animation a1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
    }
    public void blink(View view)
    {
        a1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        img1.startAnimation(a1);
    }
    public void bounce(View view)
    {
        a1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        img1.startAnimation(a1);
    }
    public void clock(View view)
    {
        a1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        img1.startAnimation(a1);
    }
    public void fade(View view)
    {
        a1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        img1.startAnimation(a1);
    }
    public void move(View view)
    {
        a1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        img1.startAnimation(a1);
    }
    public void sequence(View view)
    {
        a1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequantial);
        img1.startAnimation(a1);
    }
    public void slide_down(View view)
    {
        a1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        img1.startAnimation(a1);
    }
    public void slide_up(View view)
    {
        a1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        img1.startAnimation(a1);
    }

}