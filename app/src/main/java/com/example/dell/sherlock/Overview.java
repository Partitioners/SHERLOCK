package com.example.dell.sherlock;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Overview extends Fragment {


    public Overview() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("SHERLOCK : OVERVIEW");
            View rootView = inflater.inflate(R.layout.first, container, false);

        Button button=(Button)rootView.findViewById(R.id.youtube);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=qlcWFoNqZHc"));
                startActivity(i);
            }
        });
        ArrayList<seasonlist> words=new ArrayList<seasonlist>();
        words.add(new seasonlist(BitmapFactory.decodeResource(this.getResources(),R.drawable.s01e02),"1"));
        words.add(new seasonlist(BitmapFactory.decodeResource(this.getResources(),R.drawable.s02e02),"2"));
        words.add(new seasonlist(BitmapFactory.decodeResource(this.getResources(),R.drawable.s03e02),"3"));

        customarrayadapter adapter=new customarrayadapter(words);             //maybe this needs to change to words only ie getactivity needs to be removed
        RecyclerView recylView=(RecyclerView) rootView.findViewById(R.id.list);              //change listview to recycler in list.xml
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recylView.setLayoutManager(horizontalLayoutManagaer);
        recylView.setAdapter(adapter);



        return rootView;
    }


}
