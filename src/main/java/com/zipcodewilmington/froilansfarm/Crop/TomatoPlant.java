package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Edible.Tomato;

public class TomatoPlant extends Crop {

    Tomato tomato;

    public TomatoPlant() {}
    public TomatoPlant(boolean harvested) {
        super();
    }

    public void yeild() {
        if(harvested && fertilized){
            tomato = new Tomato();

        }

    }
    public Tomato getTomato() {
        return tomato;
    }

    public void setFertilized(boolean b) {
        this.fertilized = b;
    }

    public boolean getFertStatus() {
        return this.fertilized;
    }



}
