package com.example.sliinsuredcalculator.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sliinsuredcalculator.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SumAssuredToPremiumCV(View view) {
        Intent intent = new Intent(MainActivity.this,SumAssuredActivity.class);
        startActivity(intent);
    }

    public void PremiumToSumAssuredCV(View view) {
        Intent intent = new Intent(MainActivity.this,PremiumActivity.class);
        startActivity(intent);
    }
}
