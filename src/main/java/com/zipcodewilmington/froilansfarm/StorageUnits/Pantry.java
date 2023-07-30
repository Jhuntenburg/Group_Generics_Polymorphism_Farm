package com.zipcodewilmington.froilansfarm.StorageUnits;


import Edible.*;

import java.util.ArrayList;

public class Pantry extends ArrayList<Edible>{

    private static ArrayList<Tomato> tomatoList;
    private static ArrayList<Kale> kaleList;
    private static ArrayList<EarCorn> earCornList;
    private static ArrayList<Egg> eggList;

    public Pantry() {
        this.tomatoList = new ArrayList<Tomato>();
        this.kaleList = new ArrayList<Kale>();
        this.earCornList = new ArrayList<EarCorn>();
        this.eggList = new ArrayList<Egg>();
    }



}
