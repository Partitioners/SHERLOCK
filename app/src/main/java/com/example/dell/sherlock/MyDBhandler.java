package com.example.dell.sherlock;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;
import java.lang.String;
/**
 * Created by DELL on 30-12-2016.
 */

public class MyDBhandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "episodesManager";

    // Contacts table name
    private static final String TABLE_CONTACTS = "episodes";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "epname";
    private static final String KEY_DURATION = "duration";
    private static final String KEY_DATE = "dateaired";
    private static final String KEY_USER="userrev";
    private static final String KEY_CRITIC="criticrev";
    private static final String KEY_SUMMARY="summary";
   // private static final String KEY_IMAGE = "image_data";
    private static final String KEY_RATINGS="eprate";



    public MyDBhandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_NAME + " TEXT,"
                + KEY_DURATION + " TEXT," +KEY_DATE + " TEXT," +KEY_USER + " TEXT," +KEY_CRITIC + " TEXT,"
                +KEY_SUMMARY + " TEXT," +KEY_RATINGS + " TEXT );" ;
        db.execSQL(CREATE_CONTACTS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

        // Create tables again
        onCreate(db);

    }

    void addEpisode(EpisodesInfo episodes) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, episodes.getName()); // Contact Name
        values.put(KEY_DURATION, episodes.getDuration());
        values.put(KEY_DATE, episodes.getDate());
        values.put(KEY_USER, episodes.getUser());
        values.put(KEY_CRITIC, episodes.getCritics());
        values.put(KEY_SUMMARY, episodes.getSummary());
        values.put(KEY_RATINGS, episodes.getRatings());

        /*Bitmap bmp=episodes.getImage();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG,100, stream);
        byte[] byteArray = stream.toByteArray();
Bitmap bitmap = BitmapFactory.decodeFile("/path/images/image.jpg");
ByteArrayOutputStream blob = new ByteArrayOutputStream();
bitmap.compress(CompressFormat.PNG, 0 /* Ignored for PNGs , blob);
        byte[] bitmapdata = blob.toByteArray();



        values.put(KEY_IMAGE,byteArray);

         Inserting Row */
        db.insert(TABLE_CONTACTS, null, values);
        db.close(); // Closing database connection
    }
   private String[] cols=new String[]{KEY_ID,KEY_NAME,KEY_DATE,KEY_USER,KEY_CRITIC,KEY_DURATION,KEY_RATINGS,KEY_SUMMARY};
    public String retval(int i,int pos) {

        SQLiteDatabase db = this.getReadableDatabase();
Cursor c=db.query(TABLE_CONTACTS,new String[]{KEY_ID,KEY_NAME,KEY_DURATION,KEY_SUMMARY,KEY_CRITIC,
                           KEY_DATE,KEY_USER,KEY_RATINGS},null,null,null,null,null);
        c.moveToPosition(i);
        int name=c.getColumnIndex(cols[pos+1]);
String ret=c.getString(name);
        c.close();
        db.close();
        return ret;

    }


     }




