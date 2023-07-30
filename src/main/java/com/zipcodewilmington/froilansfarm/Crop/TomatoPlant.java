package com.zipcodewilmington.froilansfarm.Crop;

import Edible.Tomato;

public class TomatoPlant extends Crop {

    Tomato tomato;

    public TomatoPlant(boolean harvested) {
        super(harvested);
    }

    public void yeild() {
        if(harvested && fertilized){
            tomato = new Tomato();

        }

    }




}
