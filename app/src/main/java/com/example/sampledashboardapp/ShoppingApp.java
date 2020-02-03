package com.example.sampledashboardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ShoppingApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_app);
        this.setTitle("Shopping Mall");
    }
}
