package com.example.akminimall;


import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class AboutActivity extends AppCompatActivity {

    private Toolbar toolbar7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView imageView12 = findViewById(R.id.imageView12);

        //GaussianBlur.with(getApplicationContext()).size(100).radius(5).put(R.drawable.aboutbg, imageView12);
    }
}
