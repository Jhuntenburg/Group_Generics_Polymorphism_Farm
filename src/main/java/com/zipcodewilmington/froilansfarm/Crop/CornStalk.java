package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Edible.EarCorn;


public class CornStalk extends Crop{
    EarCorn ec;

    public CornStalk(boolean harvested) {
        super(harvested);
    }

    public void yeild() {
        if(harvested && fertilized){
            ec = new EarCorn();

        }

    }


}
