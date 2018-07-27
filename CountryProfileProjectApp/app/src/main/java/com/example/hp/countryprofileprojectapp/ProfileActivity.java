package com.example.hp.countryprofileprojectapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {


    private ImageView imageView;
    private Bundle bundle;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.profileImageView);
        textView = findViewById(R.id.profileTextView);

        bundle = getIntent().getExtras();

        if (bundle!=null){


            String countryName = bundle.getString("name");

            ShowDetais(countryName);
        }
    }

    private void ShowDetais(String countryName) {

        if (countryName.equals("Bangladesh")){

            imageView.setImageResource(R.drawable.bangladesh);
            textView.setText(R.string.bangladesh_profile);
        }
        else if (countryName.equals("India")){

            imageView.setImageResource(R.drawable.india);
            textView.setText(R.string.india_profile);

        }

        else if (countryName.equals("Pakisthan")){

            imageView.setImageResource(R.drawable.pakisthan);
            textView.setText(R.string.pakisthan_profile);
        }

    }
}
