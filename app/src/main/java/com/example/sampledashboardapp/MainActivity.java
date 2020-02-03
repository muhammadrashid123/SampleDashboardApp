package com.example.sampledashboardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onclick(View view) {
        if (view.getId() == R.id.city1) {
            Intent intent = new Intent(this,LahoreApp.class);
            startActivity(intent);
        } else if (view.getId() == R.id.city2) {

            Intent intent = new Intent(this,KarchiApp.class);
            startActivity(intent);
        }


    }
}