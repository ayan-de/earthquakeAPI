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

        ArrayList<Earthquake> earthquakes = new ArrayList<>();

        earthquakes.add(new Earthquake("7.2","Kolkata","Feb 2nd 2023"));
        earthquakes.add(new Earthquake("7.2","Kolkata","Feb 2nd 2023"));
        earthquakes.add(new Earthquake("7.2","Kolkata","Feb 2nd 2023"));
        earthquakes.add(new Earthquake("7.2","Kolkata","Feb 2nd 2023"));
        earthquakes.add(new Earthquake("7.2","Kolkata","Feb 2nd 2023"));
        earthquakes.add(new Earthquake("7.2","Kolkata","Feb 2nd 2023"));

        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);

        earthquakeListView.setAdapter(adapter);

    }
}