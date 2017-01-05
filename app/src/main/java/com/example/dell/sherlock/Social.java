package com.example.dell.sherlock;


import android.content.Intent;
import android.net.Uri;
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
public class Social extends Fragment {
private int [] idt=new int[]{R.id.t1,R.id.t2,R.id.t3,R.id.t4,R.id.t5,R.id.t6};
    private String [] st=new String[]{"https://www.facebook.com/Sherlock.BBCW","https://www.facebook.com/Sherlock.BBCW/?rf=108073702554836",
            "https://twitter.com/sherlock221b","https://twitter.com/hashtag/sherlock",
            "https://www.instagram.com/sherlockology/?hl=en","http://www.bbc.co.uk/programmes/b018ttws"};
    TextView t;
    public Social() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("SHERLOCK : SOCIAL");
        View rootView =inflater.inflate(R.layout.third, container, false);
        for(int i=0;i<6;i++) {
          final int j=i;

            t = (TextView) rootView.findViewById(idt[i]);

            t.setText(st[i]);

            t.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent ip = new Intent(Intent.ACTION_VIEW, Uri.parse(st[j]));
                    startActivity(ip);
                }
            });
        }
        return rootView;

    }


}
