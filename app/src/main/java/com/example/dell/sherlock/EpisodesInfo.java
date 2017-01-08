package com.example.dell.sherlock;

/**
 * Created by DELL on 30-12-2016.
 */


public class EpisodesInfo {

   private int _id;
   private String _episodename;
   private String _duration;
   private String _date;
    private String _user;
   private String _critics;
    private String _summary;
    private String _epratings;


    public EpisodesInfo(){

    }




    public EpisodesInfo( String name, String date,String user,String critics,String summary,String duration,String ratings){

        this._episodename = name;
        this._duration = duration;

        this._date=date;
        this._user=user;
        this._critics=critics;
        this._summary=summary;
        this._epratings=ratings;
    }



    public void setID(int id){
        this._id=id;
    }

    public int getID(){
        return this._id;
    }




    public String getName(){
        return this._episodename;
    }

       public void setName(String name){
        this._episodename = name;
    }


    public String getDuration(){
        return this._duration;
    }


    public void setDuration(String duration){
        this._duration = duration;
    }

    public String getUser(){
        return this._user;
    }


    public void setuser(String user){
        this._user = user;
    }

    public String getSummary(){
        return this._summary;
    }


    public void setSummary(String summary){
        this._summary = summary;
    }

    public String getDate(){
        return this._date;
    }


    public void setDate(String date){
        this._date = date;
    }

    public String getCritics(){
        return this._critics;
    }


    public void setCritics(String critics){
        this._critics = critics;
    }

    public String getRatings(){
        return this._epratings;
    }


    public void setRatings(String ratings){
        this._epratings = ratings;
    }


}