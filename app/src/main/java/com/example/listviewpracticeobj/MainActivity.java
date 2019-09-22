package com.example.listviewpracticeobj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    ArrayList<Item> flagList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        flagList.add(new Item("Brazil", R.drawable.brazil_flag));
        flagList.add(new Item("USA", R.drawable.usa_flag));
        flagList.add(new Item("EU", R.drawable.eu_flag));
        flagList.add(new Item("India", R.drawable.india_flag));
        flagList.add(new Item("Germany", R.drawable.germany_flag));
        flagList.add(new Item("Korea", R.drawable.korea_flag));
        flagList.add(new Item("France", R.drawable.france_flag));
        MyAdapter myAdapter =
                new MyAdapter(this, R.layout.list_view_items, flagList);
        simpleList.setAdapter(myAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent,
                                  View view, int position, long id) {
              Item item = (Item)
                      simpleList.getItemAtPosition(position);
              String str = item.getFlagName();
              Toast.makeText(getBaseContext(), str,
                      Toast.LENGTH_SHORT).show();
          }
        });
    }
}
