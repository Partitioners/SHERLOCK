package com.example.dell.sherlock;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;


import static com.example.dell.sherlock.MainActivity.a;
import static com.example.dell.sherlock.MainActivity.bs;
import static com.example.dell.sherlock.MainActivity.iv;
import static com.example.dell.sherlock.MainActivity.iv1;
import static com.example.dell.sherlock.MainActivity.t;
//import static com.example.dell.sherlock.MainActivity.mfrag;

/**
 * A simple {@link Fragment} subclass.
 */
public class S01E01 extends Fragment{
    //String name, String date,String user,String critics,String summary,String duration,Bitmap image
   private int ids=0;
    MyDBhandler db;
  public S01E01() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        getActivity().setTitle("SHERLOCK : SEASON 1");

        View rootView = inflater.inflate(R.layout.episodes, container, false);
iv=(ImageView) rootView.findViewById(R.id.video);
        iv.setImageResource(R.drawable.vs1e1);
        for(int i=0;i<2;i++) {
        iv1=(ImageView)rootView.findViewById(bs[i]);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=704AblLNlY8"));
                startActivity(i);
            }
        });
        }
        db=new MyDBhandler(getActivity());
        ImageView imageView=(ImageView)rootView.findViewById(R.id.image1);
        imageView.setImageResource(R.drawable.s01e01);

        for(int i=0;i<7;i++) {
    t = (TextView) rootView.findViewById(a[i]);
    t.setText(db.retval(ids,i));
}
        db.close();

    return rootView;}

}
