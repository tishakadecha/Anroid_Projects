package com.example.sqlite_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText rno,name,city,mark;
    Button add,update,del,display,display_all,about;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rno = findViewById(R.id.rno);
        name = findViewById(R.id.name);
        city = findViewById(R.id.city);
        mark = findViewById(R.id.mark);

        add = findViewById(R.id.add);
        update = findViewById(R.id.update);
        del = findViewById(R.id.del);
        display = findViewById(R.id.display);
        display_all = findViewById(R.id.display_all);
        about = findViewById(R.id.about);

        add.setOnClickListener(this);
        update.setOnClickListener(this);
        del.setOnClickListener(this);
        display.setOnClickListener(this);
        display_all.setOnClickListener(this);
        about.setOnClickListener(this);

        db = openOrCreateDatabase("studentdb", Context.MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(rno integer PRIMARY KEY AUTOINCREMENT,name varchar,city varchar,mark varchar)");
    }

    @Override
    public void onClick(View view) {
        if(view == add){
            if(name.getText().toString().trim().length()==0 || city.getText().toString().trim().length()==0 || mark.getText().toString().trim().length()==0){
                showMsg("Error","Please Enter All Values...");
                return;
            }
            db.execSQL("insert into student(name,city,mark) values('"+name.getText().toString()+"','"+city.getText().toString()+"','"+mark.getText().toString()+"')");
            showMsg("Student","Record Inserted Successfully...");
            clearall();
        }
        if(view == update){
            if(rno.getText().toString().trim().length()==0){
                showMsg("Error","Please Enter Roll No...");
                return;
            }
            Cursor c1 = db.rawQuery("select * from student where rno='"+rno.getText().toString()+"'",null);
            if (c1.moveToFirst())
            {
                db.execSQL("update student set name ='"+name.getText().toString()+"',city ='"+city.getText().toString()+"',mark ='"+mark.getText().toString()+"'");
                showMsg("Student","Record Updated Successfully");
            }
            clearall();
        }
        if(view == del){
            if(rno.getText().toString().trim().length()==0){
                showMsg("Error","Please Enter Roll No...");
                return;
            }
            Cursor c1 = db.rawQuery("select * from student where rno='"+rno.getText().toString()+"'",null);
            if (c1.moveToFirst())
            {
                db.execSQL("delete from student where rno ='"+rno.getText().toString()+"'");
                showMsg("Student","Record Deleted Successfully");
                clearall();
            }
        }
        if(view == display){
            if(rno.getText().toString().trim().length()==0){
                showMsg("Error","Please Enter Roll No...");
                return;
            }
            Cursor c1 = db.rawQuery("select * from student where rno='"+rno.getText().toString()+"'",null);
            clearall();
            if (c1.moveToFirst())
            {
                rno.setText(c1.getString(0));
                name.setText(c1.getString(1));
                city.setText(c1.getString(2));
                mark.setText(c1.getString(3));
            }
            else
            {
                showMsg("Error","Invalid Roll No...");
            }
        }
        if(view == display_all){
            StringBuffer sb1 = new StringBuffer();
            Cursor c1 = db.rawQuery("select * from student",null);
            while(c1.moveToNext())
            {
                sb1.append("\nRoll No = "+c1.getString(0));
                sb1.append("\nName is = "+c1.getString(1));
                sb1.append("\nCity is = "+c1.getString(2));
                sb1.append("\nMark is = "+c1.getString(3));
                sb1.append("\n=========================\n");
            }
            showMsg("Student",sb1.toString());
        }
        if(view == about){
            Intent i1 = new Intent(getApplicationContext(),About_Us.class);
            startActivity(i1);
        }
    }
    private void clearall()
    {
        rno.setText("");
        name.setText("");
        city.setText("");
        mark.setText("");
    }
    private void showMsg(String title,String msg)
    {
        AlertDialog.Builder b1 = new AlertDialog.Builder(this);
        b1.setCancelable(true);
        b1.setTitle(title);
        b1.setMessage(msg);
        b1.show();
    }
}