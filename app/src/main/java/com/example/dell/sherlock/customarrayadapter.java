package com.example.dell.sherlock;

/**
 * Created by DELL on 28-12-2016.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 28-12-2016.
 */

public class customarrayadapter extends RecyclerView.Adapter<customarrayadapter.MyViewHolder>{



    private static final String LOG_TAG = customarrayadapter.class.getSimpleName();
    public Context context;
  private List<seasonlist> horList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView numberTextView;
        public ImageView bmp;
        public CardView cd;
        public MyViewHolder(View view) {
            super(view);
            context=view.getContext();
            bmp=(ImageView) view.findViewById(R.id.txt1);
             numberTextView = (TextView) view.findViewById(R.id.txt);
            cd=(CardView)view.findViewById(R.id.crd);

        }
    }



    public customarrayadapter(ArrayList<seasonlist> horlist) {
        this.horList=horlist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.seasonview, parent, false);

        return new MyViewHolder(itemView);
    }

   @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.numberTextView.setText(horList.get(position).retind());
       holder.bmp.setImageBitmap(horList.get(position).retimg());

        holder.cd.setOnClickListener(
                new View.OnClickListener(){
    @Override
    public void onClick(View v){

                Intent i=new Intent(context,Season1.class);
                  i.putExtra("",position);
                context.startActivity(i);
          }

});

    }

    @Override
    public int getItemCount() {
        return horList.size();
    }

}
