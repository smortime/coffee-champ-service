package com.smort.coffeechampservice.models;

import java.util.ArrayList;

public class Preference {
    private ArrayList<String> preferences;

    public Preference() {

    }

    public Preference(ArrayList<String> preferences){
        super();
        this.preferences = preferences;
    }

    public ArrayList getPreferences(){
        return preferences;
    }

    public void setPreferences(ArrayList<String> preferences){
        this.preferences = preferences;
    }
}
