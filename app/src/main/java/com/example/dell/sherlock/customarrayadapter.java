package com.example.dell.sherlock;

/**
 * Created by DELL on 28-12-2016.
 */

import android.app.Activity;
import android.support.annotation.NonNull;
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

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param androidFlavors A List of AndroidFlavor objects to display in a list
     */
    private List<seasonlist> horList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View view) {
            super(view);
            TextView nameTextView = (TextView) view.findViewById(R.id.txt);
            TextView numberTextView = (TextView) view.findViewById(R.id.txt1);

        }
    }



    public customarrayadapter(ArrayList<seasonlist> horlist) {
        this.horList=horlist;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.seasonview, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        seasonlist currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name

        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.retdefault());

        // Find the TextView in the list_item.xml layout with the ID version_number

        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidFlavor.rethindi());



        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
