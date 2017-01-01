package com.example.dell.sherlock;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Season2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPagers2 = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        season2fragadapt adapters2 = new season2fragadapt(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPagers2.setAdapter(adapters2);

        TabLayout tabLayouts2 = (TabLayout) findViewById(R.id.tabs);


        tabLayouts2.setupWithViewPager(viewPagers2);
    }
}
