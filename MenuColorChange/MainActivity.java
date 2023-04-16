package com.example.menucc;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = new LinearLayout(this);
        l1.setOnCreateContextMenuListener(this);
        setContentView(l1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;

    }

    private void CreateMenu(Menu m)
    {
        MenuItem mnu1 = m.add(0,0,0,"Red");
        MenuItem mnu2 = m.add(0,1,1,"Green");
        MenuItem mnu3 = m.add(0,2,2,"Blue");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return MenuChoice(item);
    }
    private boolean MenuChoice(MenuItem item)
    {
        switch (item.getItemId()){
            case 0:
                l1.setBackgroundColor(Color.rgb(255,0,0));
                return true;
            case 1:
                l1.setBackgroundColor(Color.rgb(0,255,0));
                return true;
            case 2:
                l1.setBackgroundColor(Color.rgb(0,0,255));
                return true;
        }
        return false;
    }
}

