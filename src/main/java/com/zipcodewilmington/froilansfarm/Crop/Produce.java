package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Edible.Edible;

public interface Produce <AnyType extends Edible> {
    public void yeild();

    public void hasBeenHarvested();



}
