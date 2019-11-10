package com.example.matchcomet;

import android.util.Log;

import com.example.matchcomet.GroupComets;

import java.util.Vector;

public class TotalGroups {
    static Vector comets = new Vector();
    public static void addGroup(GroupComets c)
    {if (comets.size() == 5){
        comets.set(4, c);
    }else{
        comets.add(c);
    }
    }
    public static void print(){
        for (int i = 0; i < comets.size(); i++){
            GroupComets n = (GroupComets) comets.get(i);
            Log.d("Total Groups", n.getGroupTitle());
        }
    }
    public static int getSize(){
        return comets.size();
    }

    public static Vector getVector(){
        return comets;
    }
}
