package com.example.dell.sherlock;

import android.graphics.Bitmap;

/**
 * Created by DELL on 28-12-2016.
 */

public class seasonlist {

    private Bitmap img;
    private String index;
    private String castname;
    private int id;
    public seasonlist(Bitmap a,String b)
    {
        img=a;
        index=b;

    }
    public seasonlist(int a,String b,String c)
    {
        id=a;
        index=b;
castname=c;
    }
    public Bitmap retimg()
    {return img;}
    public String retind()
    {return index;}
public String cstname()
{return castname;}
    public int image()
    {return id;}

}

