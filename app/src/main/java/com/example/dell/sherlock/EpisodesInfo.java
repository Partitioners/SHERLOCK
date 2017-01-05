package com.example.dell.sherlock;

/**
 * Created by DELL on 30-12-2016.
 */

import android.graphics.Bitmap;

public class EpisodesInfo {

    //private variables
   private int _id;
   private String _episodename;
   private String _duration;
   private String _date;            //date of airing of episode
private String _user;            //reviews of users
   private String _critics;         //reviews of critics both are textviews and setText to user and critics
  // private Bitmap _image;
   private String _summary;
    private String _epratings;

    // Empty constructor
    public EpisodesInfo(){

    }
    // constructor
    public EpisodesInfo(int id, String name, String date,String user,String critics,String summary,String duration,String ratings){
        this._id = id;      //
        this._episodename = name;    //
        this._duration = duration;    //
        //this._image=image;     //
        this._date=date;            //date of airing of episode
        this._user=user;            //reviews of users
        this._critics=critics;
        this._summary=summary;
        this._epratings=ratings;
    }

    // constructor
    public EpisodesInfo( String name, String date,String user,String critics,String summary,String duration,String ratings){

        this._episodename = name;
        this._duration = duration;
        //this._image=image;
        this._date=date;            //date of airing of episode
        this._user=user;            //reviews of users
        this._critics=critics;
        this._summary=summary;
        this._epratings=ratings;
    }

    /*public Bitmap getImage() {
        return this._image;
    }

    public void setImage(Bitmap image) {
        this._image=image;
    }
*/

    public void setID(int id){
        this._id=id;
    }
    // getting ID
    public int getID(){
        return this._id;
    }



    // getting name
    public String getName(){
        return this._episodename;
    }

    // setting name
    public void setName(String name){
        this._episodename = name;
    }

    // getting phone number
    public String getDuration(){
        return this._duration;
    }

    // setting phone number
    public void setDuration(String duration){
        this._duration = duration;
    }

    public String getUser(){
        return this._user;
    }

    // setting name
    public void setuser(String user){
        this._user = user;
    }

    public String getSummary(){
        return this._summary;
    }

    // setting name
    public void setSummary(String summary){
        this._summary = summary;
    }

    public String getDate(){
        return this._date;
    }

    // setting name
    public void setDate(String date){
        this._date = date;
    }

    public String getCritics(){
        return this._critics;
    }

    // setting name
    public void setCritics(String critics){
        this._critics = critics;
    }

    public String getRatings(){
        return this._epratings;
    }

    // setting name
    public void setRatings(String ratings){
        this._epratings = ratings;
    }


}