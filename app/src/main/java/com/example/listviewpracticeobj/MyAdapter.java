package com.example.listviewpracticeobj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Item> {
    ArrayList<Item> flagList = new ArrayList<>();
    public MyAdapter(Context context, int textViewResourceId,
                     ArrayList<Item> objects) {
        super(context, textViewResourceId, objects);
        flagList = objects;
    }
    @Override
    public int getCount() {
        return super.getCount();
    }
    @Override
    public View getView(int position, View v, ViewGroup parent) {
        Item user = getItem(position);
        if (v == null)
            v = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view_items, parent, false);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        ImageView imageView = (ImageView)
                v.findViewById(R.id.imageView);
        textView.setText(flagList.get(position).getFlagName());
        imageView.setImageResource(
                flagList.get(position).getFlagImage());
        return v;
    }
} //end of class MyAdapter
