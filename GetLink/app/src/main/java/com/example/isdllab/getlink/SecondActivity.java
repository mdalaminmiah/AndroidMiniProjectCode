package com.example.isdllab.getlink;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SecondActivity extends ArrayAdapter<CustomAdapter> {
    private List<CustomAdapter> listitem;
    private Context context;

    public SecondActivity(Context context, int textViewResourceId, List<CustomAdapter> listitem) {
        super(context, textViewResourceId,listitem);
        this.listitem = listitem;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View customView = convertView;

        if (customView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            customView = layoutInflater.inflate(R.layout.custom_layout, null);
        }
        CustomAdapter customAdapter = listitem.get(position);
        if (customAdapter != null) {
            //name
            TextView nameTextView = customView.findViewById(R.id.tv1);
            nameTextView.setText(customAdapter.getName());

            //link
            TextView linkTextView = customView.findViewById(R.id.tv2);
            linkTextView.setText(customAdapter.getLink());

            //image
            ImageView imageView = customView.findViewById(R.id.imId);
            imageView.setImageResource(customAdapter.getPic());

        }
        return customView;
    }
}
