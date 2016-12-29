package com.example.dell.sherlock;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
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



            View rootView = inflater.inflate(R.layout.first, container, false);
        ArrayList<seasonlist> words=new ArrayList<seasonlist>();
        words.add(new seasonlist("SEASON","1"));
        words.add(new seasonlist("SEASON","2"));
        words.add(new seasonlist("SEASON","3"));

        customarrayadapter adapter=new customarrayadapter(getActivity(),words);
        ListView listView=(ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> l, View v, int position, long id) {
                switch (position) {
                    case 0:       Intent i = new Intent(getActivity(), Season1.class);
                        startActivity(i);
                        break;
                    case 1:        Intent i1=new Intent(getActivity(),Season2.class);
                        startActivity(i1);
                        break;
                    case 2:        Intent i2=new Intent(getActivity(),Season3.class);
                        startActivity(i2);
                        break;
                }
            }
        });

        return rootView;
    }

}
