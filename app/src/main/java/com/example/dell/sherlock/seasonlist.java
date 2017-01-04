package com.example.dell.sherlock;

import android.graphics.Bitmap;

/**
 * Created by DELL on 28-12-2016.
 */

public class seasonlist {

    private Bitmap img;
    private String index;

    public seasonlist(Bitmap a,String b)
    {
        img=a;
        index=b;

    }
    public Bitmap retimg()
    {return img;}
    public String retind()
    {return index;}
}

