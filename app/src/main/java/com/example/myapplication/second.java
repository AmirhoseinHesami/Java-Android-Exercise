package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class second extends AppCompatActivity {

    WebView mweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mweb = findViewById(R.id.web);
        mweb.loadUrl("https://www.google.com");
    }
}