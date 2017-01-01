package com.example.dell.sherlock;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Season3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPagers3 = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        season3fragadapt adapters3 = new season3fragadapt(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPagers3.setAdapter(adapters3);

        TabLayout tabLayouts3 = (TabLayout) findViewById(R.id.tabs);


        tabLayouts3.setupWithViewPager(viewPagers3);
    }
}
