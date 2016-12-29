package com.example.dell.sherlock;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DELL on 29-12-2016.
 */

public class Fragadaptfront extends FragmentPagerAdapter {
    public Fragadaptfront(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Overview();
        } else if (position == 1){
            return new Info();
        } else {
            return new Social();
        }
    }



    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {

        if(position==0)
            return "OVERVIEW";
            else if(position==1)
            return "INFO";
            else
            return "SOCIAL";


    }
}
