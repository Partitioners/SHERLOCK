package com.example.dell.sherlock;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import static com.example.dell.sherlock.MainActivity.a;
import static com.example.dell.sherlock.MainActivity.bs;
import static com.example.dell.sherlock.MainActivity.iv;
import static com.example.dell.sherlock.MainActivity.iv1;
import static com.example.dell.sherlock.MainActivity.t;



public class S01E03 extends Fragment {

    private int ids=2;
    MyDBhandler db;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
getActivity().setTitle("SHERLOCK : SEASON 1");
        //
        View rootView = inflater.inflate(R.layout.episodes, container, false);//
        iv=(ImageView) rootView.findViewById(R.id.video);
        iv.setImageResource(R.drawable.vs1e3);
        for(int i=0;i<2;i++) {
            iv1=(ImageView)rootView.findViewById(bs[i]);
            iv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=AviDWKhmVdU"));
                    startActivity(i);
                }
            });
        }

        db=new MyDBhandler(getActivity());
        ImageView imageView=(ImageView)rootView.findViewById(R.id.image1);
        imageView.setImageResource(R.drawable.s01e03);

        for(int i=0;i<7;i++) {
            t = (TextView) rootView.findViewById(a[i]);
            t.setText(db.retval(ids,i));
        }
        db.close();

        return rootView;}
}