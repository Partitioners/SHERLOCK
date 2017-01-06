package com.example.dell.sherlock;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        //((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("SHERLOCK : INFO");

        return inflater.inflate(R.layout.second, container, false);
    }

}
