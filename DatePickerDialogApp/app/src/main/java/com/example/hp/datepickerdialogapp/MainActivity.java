package com.example.hp.datepickerdialogapp;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textView;
    private Button button;
    private DatePicker datePicker;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.dateTextView);
        button = findViewById(R.id.datePickerbutton);

        button.setOnClickListener(this);


    }




    @Override
    public void onClick(View view) {
        datePicker = new DatePicker(this);
        int curentYear =datePicker.getYear();
        int currentMonth = (datePicker.getMonth())+1;
        int currentDay = datePicker.getDayOfMonth();

        datePickerDialog = new DatePickerDialog(this,


                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {

                        textView.setText(year+"/"+month+"/"+dayOfMonth);
                    }
                },curentYear, currentMonth, currentDay


        );
        datePickerDialog.show();
    }
}
