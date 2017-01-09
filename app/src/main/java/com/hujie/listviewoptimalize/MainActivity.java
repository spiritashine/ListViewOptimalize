package com.hujie.listviewoptimalize;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= (ListView) findViewById(R.id.lv);
        ImageView imageView=new ImageView(this);
        Toolbar toolbar=new Toolbar(this);
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setBackgroundColor(Color.CYAN);
        toolbar.setTitle("test");
        imageView.setImageResource(R.mipmap.ic_launcher);
        listView.addHeaderView(imageView);
        listView.addHeaderView(toolbar);
        listView.addFooterView(imageView);
        ArrayList<String> data=new ArrayList<>();
        for (int i=0;i<30;i++){
            data.add("HelloWorld"+i);
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(arrayAdapter);
    }
}
