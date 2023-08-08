package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Edible.EarCorn;


public class CornStalk extends Crop{
    EarCorn ec;

    public CornStalk() {
        super();

    }

    public void yeild() {
        if(harvested && fertilized){
            ec = new EarCorn();

        }
    }

    public EarCorn getEarCorn() {
        return ec;
    }

    public void setFertilized(boolean b) {
        this.fertilized = b;
    }

    public boolean getFertStatus() {
        return this.fertilized;
    }

}
