package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        AlertDialog.Builder alertB = new AlertDialog.Builder(this);

        alertB.setTitle("چک کردن");
        alertB.setMessage("یکی از دکمه های زیر را انتخاب کنید");

        alertB.setPositiveButton("تایید", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
            }
        });

        alertB.setNegativeButton("رد", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"goodbye",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alert = alertB.create();
        alert.show();
    }
}