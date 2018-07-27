package com.example.hp.listviewarrayadaperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listViewM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         listViewM = findViewById(R.id.mainListView);

         String[] skill = getResources().getStringArray(R.array.technical_skill);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.sample_adapter,R.id.sampleTextView,skill);

        listViewM.setAdapter(arrayAdapter);
    }
}
