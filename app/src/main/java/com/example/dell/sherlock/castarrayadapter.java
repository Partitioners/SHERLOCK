package com.example.dell.sherlock;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by DELL on 07-01-2017.
 */


public class castarrayadapter extends RecyclerView.Adapter<castarrayadapter.MyViewHolder>{


private static final String LOG_TAG=customarrayadapter.class.getSimpleName();
private Context context1;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView epname;
        public ImageView bmp;
        public TextView realname;
        public MyViewHolder(View view) {
            super(view);
            context1=view.getContext();
            bmp=(ImageView) view.findViewById(R.id.cstfoto);
            epname = (TextView) view.findViewById(R.id.cstep);
            realname=(TextView) view.findViewById(R.id.cstname);

        }
    }
    private List<seasonlist> castlist;
    public castarrayadapter(ArrayList<seasonlist> horlist) {
        this.castlist=horlist;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.castrecyclerview, parent, false);

        return new castarrayadapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.realname.setText(castlist.get(position).retind());
        holder.epname.setText(castlist.get(position).cstname());
        holder.bmp.setImageResource(castlist.get(position).image());
    }

    @Override
    public int getItemCount() {
        return castlist.size();
    }



}