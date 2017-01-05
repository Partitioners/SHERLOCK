package com.example.dell.sherlock;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.support.design.widget.TabLayout;

import com.google.android.youtube.player.YouTubePlayer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyDBhandler db;
    public static int [] a=new int[]{R.id.name,R.id.date,R.id.user,R.id.critics,R.id.duration,R.id.ratings,R.id.summary};
    public static final String API_KEY ="AIzaSyCCHlcWXbqouIBGnMeUYdcuc1sRDG8hii0";
    public static YouTubePlayer mfrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

db=new MyDBhandler(this);

        db.addEpisode(new EpisodesInfo("A Study in Pink","24 OCT 2010","26 users","32 critics",getString(R.string.s1e1),"1 hr 28 min",
                "9.1",BitmapFactory.decodeResource(this.getResources(),R.drawable.s01e01)));        //s01e01
       db.addEpisode(new EpisodesInfo("The Blind Banker","31 OCT 2010","17 users","29 critics",getString(R.string.s1e2),"1 hr 29 min",
                "8.1",BitmapFactory.decodeResource(this.getResources(),R.drawable.s01e02)));  //s02e02
        db.addEpisode(new EpisodesInfo("The Great Game","7 NOV 2010","14 users","28 critics",getString(R.string.s1e3),"1 hr 29 min",
               "9.1", BitmapFactory.decodeResource(this.getResources(),R.drawable.s01e03)));
        db.addEpisode(new EpisodesInfo("A Scandal in Belgravia","6 MAY 2012","47 users","25 critics",getString(R.string.s2e1),"1 hr 29 min",
               "9.5",BitmapFactory.decodeResource(this.getResources(),R.drawable.s02e01)));
        db.addEpisode(new EpisodesInfo("The Hounds of Baskerville","13 MAY 2012","15 users","21 critics",getString(R.string.s2e2),"1 hr 28 min",
               "8.5",BitmapFactory.decodeResource(this.getResources(),R.drawable.s02e02)));
        db.addEpisode(new EpisodesInfo("The Reichenbach Fall","20 MAY 2012","29 users","22 critics",getString(R.string.s2e3),"1 hr 28 min",
               "9.7",BitmapFactory.decodeResource(this.getResources(),R.drawable.s02e03)));
        //s3
        db.addEpisode(new EpisodesInfo("The Empty Hearse","19 JANUARY 2014","49 users","36 critics",getString(R.string.s3e1),"1 hr 28 min",
                "9.1",BitmapFactory.decodeResource(this.getResources(),R.drawable.s03e01)));
        db.addEpisode(new EpisodesInfo("The Sign of Three","26 JANUARY 2014","35 users","30 critics",getString(R.string.s3e2),"1 hr 26 min",
                "9",BitmapFactory.decodeResource(this.getResources(),R.drawable.s03e02)));
        db.addEpisode(new EpisodesInfo("His Last Vow","2 FEBRUARY 2014","47 users","29 critics",getString(R.string.s3e3),"1 hr 29 min",
                "9.4",BitmapFactory.decodeResource(this.getResources(),R.drawable.s03e03)));

       // db.addEpisode(new EpisodesInfo("A Study in Pink","24 OCT 2010","26 users","32 critics","put summary in string","1 hr 28 min",
               // BitmapFactory.decodeResource(this.getResources(),R.drawable.s02e04)));

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        Fragadaptfront adapter = new Fragadaptfront(getSupportFragmentManager());
//String name, String date,String users,String criticss,String summary,String duration,Bitmap image
        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);


        tabLayout.setupWithViewPager(viewPager);



db.close();
    }

}
