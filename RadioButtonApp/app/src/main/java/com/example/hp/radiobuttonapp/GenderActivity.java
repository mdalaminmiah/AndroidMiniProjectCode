package com.example.hp.radiobuttonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GenderActivity extends AppCompatActivity {

    public  final static String massage_key="You selectd: ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        /*textView = findViewById(R.id.genderTextView);*/
        TextView textView =new TextView(GenderActivity.this);
        Intent intent= getIntent();
        String massage = intent.getStringExtra(massage_key);
        textView.setText(massage);
        setContentView(textView);
    }
}
