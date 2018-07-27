package com.example.hp.listviewarrayadaperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    private ListView listViewM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         listViewM = findViewById(R.id.mainListView);

         String[] skill = getResources().getStringArray(R.array.technical_skill);

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.sample_adapter,R.id.sampleTextView,skill);

        listViewM.setAdapter(arrayAdapter);

        listViewM.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String value = arrayAdapter.getItem(position);

                Toast.makeText(MainActivity.this,value+" "+position,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
