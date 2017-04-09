package com.kainos.joannec.moodapp_b00674579;

import android.text.format.DateFormat;

/**
 * Created by joannec on 09/04/2017.
 */

public class Entry {
    String mood_name;
    String location;
    int icon_id;
    DateFormat date_time;


    Entry(String mood_name, String location, int icon_id, DateFormat date_time){
        this. mood_name = mood_name;
        this.location = location;
        this.icon_id = icon_id;
        this.date_time = date_time;


    }
}
