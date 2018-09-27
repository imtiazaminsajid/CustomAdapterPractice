package com.example.imtiazaminsajid.customadapterpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListView_details extends AppCompatActivity {
    ImageView im;
    TextView cn, pp, ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        im = findViewById(R.id.fl);
        cn = findViewById(R.id.cn);
        pp = findViewById(R.id.pp);
        ab = findViewById(R.id.discription);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            im.setImageResource(bundle.getInt("FL"));
            cn.setText(bundle.getString("CN"));
            pp.setText(bundle.getString("PP"));
            ab.setText(bundle.getString("AB"));
        }


    }
}
