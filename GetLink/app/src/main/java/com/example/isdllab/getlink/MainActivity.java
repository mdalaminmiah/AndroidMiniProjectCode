package com.example.isdllab.getlink;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class MainActivity extends ListActivity{
    SecondActivity myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List urlList = new ArrayList();

       urlList.add(new CustomAdapter("Facebook","http://www.facebook.com",R.drawable.p3));
       urlList.add(new CustomAdapter("Imo","http://www.imo.com",R.drawable.p5));
       urlList.add(new CustomAdapter("Viber","http://www.viber.com",R.drawable.p3));

       myAdapter = new SecondActivity(getApplicationContext(), R.layout.custom_layout,urlList);
       setListAdapter(myAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        CustomAdapter customAdapter = myAdapter.getItem(position);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(customAdapter.getLink()));
        startActivity(intent);
    }
}
