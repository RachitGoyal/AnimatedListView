package com.osahub.rachit.animationapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listView = (ListView) findViewById(R.id.list);
        CustomAdapter customAdapter = new CustomAdapter(this, mStrings);
        listView.setAdapter(customAdapter);
    }

    private String[] mStrings = {
            "Bordeaux", "Lyon", "Marseille", "Nancy", "Paris", "Toulouse", "Strasbourg",
            "Bordeaux", "Lyon", "Marseille", "Nancy", "Paris", "Toulouse", "Strasbourg",
            "Bordeaux", "Lyon", "Marseille", "Nancy", "Paris", "Toulouse", "Strasbourg",
            "Bordeaux", "Lyon", "Marseille", "Nancy", "Paris", "Toulouse", "Strasbourg",
            "Bordeaux", "Lyon", "Marseille", "Nancy", "Paris", "Toulouse", "Strasbourg",
            "Bordeaux", "Lyon", "Marseille", "Nancy", "Paris", "Toulouse", "Strasbourg",
            "Bordeaux", "Lyon", "Marseille", "Nancy", "Paris", "Toulouse", "Strasbourg",
            "Bordeaux", "Lyon", "Marseille", "Nancy", "Paris", "Toulouse", "Strasbourg",
            "Bordeaux", "Lyon", "Marseille", "Nancy", "Paris", "Toulouse", "Strasbourg",
            "Bordeaux", "Lyon", "Marseille", "Nancy", "Paris", "Toulouse", "Strasbourg"
    };
}