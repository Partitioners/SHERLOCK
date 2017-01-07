package com.example.dell.sherlock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
            if(position==0)
            return new S01E01();
        else if(position==1)
                return new S01E02();
            else
                return new S01E03();

        } else if (SeasonNo == 1) {
            if(position==0)
                return new S02E01();
            else if(position==1)
                return new S02E02();
            else
                return new S02E03();

        } else  {
            if(position==0)
                return new S03E01();
            else if(position==1)
                return new S03E02();
            else
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
