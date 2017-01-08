package com.example.dell.sherlock;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DELL on 29-12-2016.
 */

public class season1frafadapt extends FragmentPagerAdapter {
    private String[] title=new String[]{"Episode 1","Episode 2","Episode 3"};
    int SeasonNo;
    public season1frafadapt(FragmentManager fm) {
        super(fm);
    }
    public season1frafadapt(FragmentManager fm,int SeasonNo) {
        super(fm);
        this.SeasonNo=SeasonNo;
    }



    @Override
    public Fragment getItem(int position) {




        if (SeasonNo == 0) {
            return new Episodes(position);
        } else if (SeasonNo == 1) {
            return new Episodes(position+3);

        } else if (SeasonNo==2) {
            return new Episodes(position+6);
        }
        else  {

         if(position<2)
            return new Episodes(position + 9);
        else
             return new S04E03();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {

    return title[position];
    }
}
