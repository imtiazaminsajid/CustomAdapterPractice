package com.example.imtiazaminsajid.customadapterpractice;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] countryName;
    String[] about;
    String[] population;
    int[] flags  = {R.drawable.bangladesh,
            R.drawable.afghanistan,
            R.drawable.argentina,
            R.drawable.belgium,
            R.drawable.finland,
            R.drawable.india,
            R.drawable.pakistan,
            R.drawable.srilanka,
            R.drawable.sweden,
            R.drawable.uganda,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        countryName =  getResources().getStringArray(R.array.CountryName);
        population =  getResources().getStringArray(R.array.Population);

        CustomAdapter customAdapter = new CustomAdapter(this, countryName, flags,population);
        listView.setAdapter(customAdapter);

    }
}
