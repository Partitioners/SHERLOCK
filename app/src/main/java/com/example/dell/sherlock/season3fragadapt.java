package com.example.dell.sherlock;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DELL on 29-12-2016.
 */

public class season3fragadapt extends FragmentPagerAdapter {
    private String[] title=new String[]{"Episode 1","Episode 2","Episode 3","Episode 4"};
    public season3fragadapt(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new S03E01();
        } else if (position == 1){
            return new S03E02();
        } else {
            return new S03E03();
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
