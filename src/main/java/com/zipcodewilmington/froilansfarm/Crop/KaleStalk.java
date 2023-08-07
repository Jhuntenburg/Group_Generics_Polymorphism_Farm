package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Edible.Kale;

public class KaleStalk extends Crop{

    Kale kale;

    public KaleStalk(boolean harvested) {
        super();
    }

    public void yeild() {
        if(harvested && fertilized){
            kale = new Kale();

        }

    }


}
