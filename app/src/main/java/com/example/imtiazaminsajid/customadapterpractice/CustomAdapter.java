package com.example.imtiazaminsajid.customadapterpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] countryName;
    String[] population;
    int[] flags;
    Context context;
    LayoutInflater inflater;

    public CustomAdapter() {
    }

    public CustomAdapter(Context context,String[] countryName, int[] flags, String[] population) {
        this.countryName = countryName;
        this.population = population;
        this.flags = flags;
        this.context = context;
    }

    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null) {

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_details, viewGroup, false);
        }

        ImageView flag = view.findViewById(R.id.countryFlagIV);
        TextView country = view.findViewById(R.id.countryNameTV);
        TextView popu = view.findViewById(R.id.populationTV);

        flag.setImageResource(flags[i]);
        country.setText(countryName[i]);
        popu.setText(population[i]);


        return view;
    }
}
