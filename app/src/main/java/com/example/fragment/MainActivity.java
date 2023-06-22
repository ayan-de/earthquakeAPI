package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> earthquakes = new ArrayList<>();

        earthquakes.add("Kolkata");
        earthquakes.add("Kolkata");
        earthquakes.add("Kolkata");
        earthquakes.add("Kolkata");
        earthquakes.add("Kolkata");
        earthquakes.add("Kolkata");

        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1,earthquakes);

        earthquakeListView.setAdapter(adapter);

    }
}