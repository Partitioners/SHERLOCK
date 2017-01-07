package com.example.dell.sherlock;


import android.content.Intent;
import android.content.res.Resources;
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

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

//import static com.example.dell.sherlock.MainActivity.API_KEY;
import static com.example.dell.sherlock.MainActivity.a;
import static com.example.dell.sherlock.MainActivity.bs;
import static com.example.dell.sherlock.MainActivity.iv;
import static com.example.dell.sherlock.MainActivity.iv1;
import static com.example.dell.sherlock.MainActivity.t;

//import static com.example.dell.sherlock.MainActivity.mfrag;

/**
 * A simple {@link Fragment} subclass.
 */
public class Episodes extends Fragment {
private int []videos=new int[]{R.drawable.vs1e1,R.drawable.vs1e2,R.drawable.vs1e3,R.drawable.vs2e1,R.drawable.vs2e2,R.drawable.vs2e3,
        R.drawable.vs3e1,R.drawable.vs3e2,R.drawable.vs3e3};
    private String []urls=new String[]{"https://www.youtube.com/watch?v=704AblLNlY8","https://www.youtube.com/watch?v=y_GGbRkqqFg",
            "https://www.youtube.com/watch?v=AviDWKhmVdU","https://www.youtube.com/watch?v=E2MXppyXsUY","https://www.youtube.com/watch?v=bm78r2innnE",
            "https://www.youtube.com/watch?v=eKRCt3yCXEA","https://www.youtube.com/watch?vO7cKIjNIPoY","https://www.youtube.com/watch?vqtGf6RvjWE4",
            "https://www.youtube.com/watch?vxhjIsu7n6bI"};
    private int []images=new int[]{R.drawable.s01e01,R.drawable.s01e02,R.drawable.s01e03,R.drawable.s02e01,R.drawable.s02e02,R.drawable.s02e03,
            R.drawable.s03e01,R.drawable.s03e02,R.drawable.s03e03,};

    MyDBhandler db;
private int index;
    public Episodes() {
        // Required empty public constructor
    }
public Episodes(int index)
{this.index=index;}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("SHERLOCK : SEASON 1");
        View rootView = inflater.inflate(R.layout.episodes, container, false);

        iv=(ImageView) rootView.findViewById(R.id.video);
        iv.setImageResource(videos[index]);
        for(int i=0;i<2;i++) {
            iv1=(ImageView)rootView.findViewById(bs[i]);
            iv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse(urls[index]));
                    startActivity(i);
                }
            });
        }
        db=new MyDBhandler(getActivity());
        ImageView imageView=(ImageView)rootView.findViewById(R.id.image1);
        imageView.setImageResource(images[index]);

        for(int i=0;i<7;i++) {
            t = (TextView) rootView.findViewById(a[i]);
            t.setText(db.retval(index,i));
        }


        return rootView;}

}
