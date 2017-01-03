package com.example.dell.sherlock;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
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
        words.add(new seasonlist("SEASON","1"));
        words.add(new seasonlist("SEASON","2"));
        words.add(new seasonlist("SEASON","3"));

        customarrayadapter adapter=new customarrayadapter(getActivity(),words);             //maybe this needs to change to words only ie getactivity needs to be removed
        RecyclerView listView=(RecyclerView) rootView.findViewById(R.id.list);              //change listview to recycler in list.xml
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        listView.setLayoutManager(horizontalLayoutManagaer);
        listView.setAdapter(adapter);
        //setListViewHeightBasedOnChildren(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> l, View v, int position, long id) {
                switch (position) {
                    case 0:      ;Intent i=new Intent(getActivity(),Season1.class);
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
    /*public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }*/

}
