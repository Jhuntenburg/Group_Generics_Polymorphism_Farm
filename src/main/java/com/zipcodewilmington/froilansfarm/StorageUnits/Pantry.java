package com.zipcodewilmington.froilansfarm.StorageUnits;

import com.zipcodewilmington.froilansfarm.Edible.*;

import java.util.ArrayList;

public class Pantry extends ArrayList<Edible>{

    private  ArrayList<Tomato> tomatoList;
    private  ArrayList<Kale> kaleList;
    private ArrayList<EarCorn> earCornList;
    private  ArrayList<Egg> eggList;

    public Pantry() {
        this.tomatoList = new ArrayList<Tomato>();
        this.kaleList = new ArrayList<Kale>();
        this.earCornList = new ArrayList<EarCorn>();
        this.eggList = new ArrayList<Egg>();
    }

    public ArrayList<Tomato> getTomatoList() {
        return tomatoList;
    }

    public ArrayList<Kale> getKaleList() {
        return kaleList;
    }

    public ArrayList<EarCorn> getEarCornList() {
        return earCornList;
    }

    public ArrayList<Egg> getEggList() {
        return eggList;
    }
}
