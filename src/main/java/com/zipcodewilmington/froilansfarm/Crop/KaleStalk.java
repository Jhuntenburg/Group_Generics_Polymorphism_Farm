package com.zipcodewilmington.froilansfarm.Crop;

import Edible.Kale;
import Edible.Tomato;

public class KaleStalk extends Crop{

    Kale kale;

    public KaleStalk() {


    }

    public KaleStalk(boolean harvested) {
        super(harvested);
    }

    public void yeild() {
        if(harvested && fertilized){
            kale = new Kale();

        }

    }


}
