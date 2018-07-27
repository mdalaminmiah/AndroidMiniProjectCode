package com.example.hp.radiobuttonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button button;
    RadioButton maleRadioButton, femaleRadioButton,genderButton;
    RadioGroup radioGroup;

    public  final static String massage_key="You selectd: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.submitButton);
        radioGroup = findViewById(R.id.radioGrp);
        maleRadioButton = findViewById(R.id.maleRadioBtn);
        femaleRadioButton = findViewById(R.id.femaleRadiobtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 int selectedId=  radioGroup.getCheckedRadioButtonId();

                 genderButton= findViewById(selectedId);

                 String massage=genderButton.getText().toString();

                Intent intent = new Intent(MainActivity.this, GenderActivity.class);
                intent.putExtra(massage_key, massage);
                startActivity(intent);



            }
        });
    }


}
