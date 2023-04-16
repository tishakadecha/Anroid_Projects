package com.example.sms_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,no;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no=(EditText)findViewById(R.id.no);
        ed1=(EditText)findViewById(R.id.ed1);
        b1=(Button)findViewById(R.id.b1);

        //Performing action on button click
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String no1 = no.getText().toString();
                String msg = ed1.getText().toString();

                Intent i1 = new Intent(Intent.ACTION_VIEW);
                PendingIntent p1 = PendingIntent.getActivity(getApplicationContext(), 0, i1, 0);
                try
                {
                    //Get the SmsManager instance and call the sendTextMessage method to send message
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage(no1, null, msg, p1, null);

                    Toast.makeText(getApplicationContext(), "Message Sent successfully!", Toast.LENGTH_LONG).show();
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "Error =  "+e, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
