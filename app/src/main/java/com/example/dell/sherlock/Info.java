package com.example.dell.sherlock;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Info extends Fragment {


    public Info() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
View rootView=inflater.inflate(R.layout.second, container, false);
        getActivity().setTitle("SHERLOCK : INFO");
        ArrayList<seasonlist> words1=new ArrayList<seasonlist>();
        words1.add(new seasonlist(R.drawable.sherlock,"BENEDICT CUMBERBATCH","as Sherlock Holmes"));
        words1.add(new seasonlist(R.drawable.watson,"MARTIN FREEMAN","as Dr.John Watson"));
        words1.add(new seasonlist(R.drawable.moriarty,"ANDREW SCOTT","as James Moriarty"));
        words1.add(new seasonlist(R.drawable.mycroft,"MARK GATISS","as Mycroft Holmes"));
        words1.add(new seasonlist(R.drawable.irene,"LARA PULVER","as Irene Adler"));
        words1.add(new seasonlist(R.drawable.mary,"AMANDA ABBINGTON","as Mary Morstan"));
        words1.add(new seasonlist(R.drawable.lestrade,"RUPERT GRAVES","as Inspector Lestrade"));
        words1.add(new seasonlist(R.drawable.molly,"LOUISE BREALEY","as Molly Hooper "));
        words1.add(new seasonlist(R.drawable.hudson,"UNA STUBBS","as Mrs.Hudson"));

        castarrayadapter adapter=new castarrayadapter(words1);
        RecyclerView recylView=(RecyclerView) rootView.findViewById(R.id.list1);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recylView.setLayoutManager(horizontalLayoutManagaer);
        recylView.setAdapter(adapter);
        return rootView;
    }

}
