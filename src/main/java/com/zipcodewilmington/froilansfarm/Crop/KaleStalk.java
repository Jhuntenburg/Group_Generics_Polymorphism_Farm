package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Edible.Kale;

public class KaleStalk extends Crop{

    Kale kale;
    public KaleStalk() {}

    public KaleStalk(boolean harvested) {
        super();
    }

    public void yeild() {
        if(harvested && fertilized){
            kale = new Kale();

        }

    }

    public Kale getKale() {
        return kale;
    }

    public void setFertilized(boolean b) {
        this.fertilized = b;
    }

    public boolean getFertStatus() {
        return this.fertilized;
    }

}
