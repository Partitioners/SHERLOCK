package com.example.dell.sherlock;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by DELL on 01-01-2017.
 */

public class imgrs extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);                 //new activity for opening image on clicking will be linked to xml file thet has imageview in it
        setContentView(R.layout.img);

    }
}
