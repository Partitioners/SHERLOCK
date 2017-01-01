package com.example.dell.sherlock;

import android.content.Intent;
import android.nfc.Tag;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class Season1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPagers1 = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        season1frafadapt adapters1 = new season1frafadapt(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPagers1.setAdapter(adapters1);

        TabLayout tabLayouts1 = (TabLayout) findViewById(R.id.tabs);


        tabLayouts1.setupWithViewPager(viewPagers1);
    }
}
