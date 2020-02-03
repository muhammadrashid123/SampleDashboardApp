package com.example.sampledashboardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SchoolApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_app);
        this.setTitle("School");
    }
}
