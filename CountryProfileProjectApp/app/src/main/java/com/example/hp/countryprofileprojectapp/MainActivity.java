package com.example.hp.countryprofileprojectapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button bangladesh,india, pakisthan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladesh = findViewById(R.id.banladeshBtn);
        india = findViewById(R.id.indiaBtn);
        pakisthan = findViewById(R.id.pakisthanBtn);

        bangladesh.setOnClickListener(this);
        india.setOnClickListener(this);
        pakisthan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.banladeshBtn){

            Intent intent = new Intent( this, ProfileActivity.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);

        }
        else if (view.getId()==R.id.indiaBtn){

            Intent intent = new Intent( this, ProfileActivity.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }
        else if (view.getId()==R.id.pakisthanBtn){

            Intent intent=new Intent(this, ProfileActivity.class);
            intent.putExtra("name","Pakisthan");
            startActivity(intent);

        }



    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBulder;

        alertDialogBulder = new AlertDialog.Builder(this);
        alertDialogBulder.setIcon(R.drawable.question_icon);
        alertDialogBulder.setTitle(R.string.alert_title);
        alertDialogBulder.setMessage(R.string.alert_massege);
        alertDialogBulder.setCancelable(false);


        alertDialogBulder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               finish();
            }
        });
        alertDialogBulder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBulder.create();
        alertDialog.show();

    }
}
