package com.zipcodewilmington.froilansfarm.Crop;

import Edible.Edible;

public interface Produce <AnyType extends Edible> {
    public void yeild();

    public void hasBeenHarvested();



}
