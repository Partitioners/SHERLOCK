package com.example.dell.sherlock;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.support.design.widget.TabLayout;

import com.google.android.youtube.player.YouTubePlayer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyDBhandler db;
    public static ImageView iv,iv1;
    public static TextView t;
    public static int [] a=new int[]{R.id.name,R.id.date,R.id.duration,R.id.ratings,R.id.summary,R.id.user,R.id.critics};
public static int [] bs=new int[]{R.id.video,R.id.play};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

db=new MyDBhandler(this);

        db.addEpisode(new EpisodesInfo("A Study in Pink","24 OCT 2010","http://www.imdb.com/title/tt1665071/reviews?ref_=tt_ov_rt","http://www.imdb.com/title/tt1665071/externalreviews?ref_=tt_ov_rt",getString(R.string.s1e1),"1 hr 28 min",
                "9.1"));        //s01e01
       db.addEpisode(new EpisodesInfo("The Blind Banker","31 OCT 2010","http://www.imdb.com/title/tt1664529/reviews?ref_=tt_ov_rt","http://www.imdb.com/title/tt1664529/externalreviews?ref_=tt_ov_rt",getString(R.string.s1e2),"1 hr 29 min",
                "8.1"));
        db.addEpisode(new EpisodesInfo("The Great Game","7 NOV 2010","http://www.imdb.com/title/tt1664530/reviews?ref_=tt_ov_rt","http://www.imdb.com/title/tt1664530/externalreviews?ref_=tt_ov_rt",getString(R.string.s1e3),"1 hr 29 min",
               "9.1"));
        db.addEpisode(new EpisodesInfo("A Scandal in Belgravia","6 MAY 2012","http://www.imdb.com/title/tt1942612/reviews?ref_=tt_ov_rt","http://www.imdb.com/title/tt1942612/externalreviews?ref_=tt_ov_rt",getString(R.string.s2e1),"1 hr 29 min",
               "9.5"));
        db.addEpisode(new EpisodesInfo("The Hounds of Baskerville","13 MAY 2012","http://www.imdb.com/title/tt1942613/reviews?ref_=tt_ov_rt","http://www.imdb.com/title/tt1942613/externalreviews?ref_=tt_ov_rt",getString(R.string.s2e2),"1 hr 28 min",
               "8.5"));
        db.addEpisode(new EpisodesInfo("The Reichenbach Fall","20 MAY 2012","http://www.imdb.com/title/tt1942614/reviews?ref_=tt_ov_rt","http://www.imdb.com/title/tt1942614/externalreviews?ref_=tt_ov_rt",getString(R.string.s2e3),"1 hr 28 min",
               "9.7"));

        db.addEpisode(new EpisodesInfo("The Empty Hearse","19 JANUARY 2014","http://www.imdb.com/title/tt2189771/reviews?ref_=tt_ov_rt","http://www.imdb.com/title/tt2189771/externalreviews?ref_=tt_ov_rt",getString(R.string.s3e1),"1 hr 28 min",
                "9.1"));
        db.addEpisode(new EpisodesInfo("The Sign of Three","26 JANUARY 2014","http://www.imdb.com/title/tt2781042/reviews?ref_=tt_ov_rt","http://www.imdb.com/title/tt2781042/externalreviews?ref_=tt_ov_rt",getString(R.string.s3e2),"1 hr 26 min",
                "9"));
        db.addEpisode(new EpisodesInfo("His Last Vow","2 FEBRUARY 2014","http://www.imdb.com/title/tt2781046/reviews?ref_=tt_ov_rt","http://www.imdb.com/title/tt2781046/externalreviews?ref_=tt_ov_rt",getString(R.string.s3e3),"1 hr 29 min",
                "9.4"));

        db.addEpisode(new EpisodesInfo("The Six Thatchers","1 JANUARY 2017","http://www.imdb.com/title/tt3538760/reviews?ref_=tt_ov_rt","http://www.imdb.com/title/tt3538760/externalreviews?ref_=tt_ov_rt",getString(R.string.s4e1),"1 hr 28 min",
                "8.0"));
        db.addEpisode(new EpisodesInfo("The Lying Detective","8 JANUARY 2017","N/A","N/A",getString(R.string.s4e2),"1 hr 28 min",
                "9.9"));




        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        Fragadaptfront adapter = new Fragadaptfront(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        db.close();
    }

}
