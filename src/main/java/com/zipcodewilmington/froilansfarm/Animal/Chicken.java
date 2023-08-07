package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Edible.Egg;
import com.zipcodewilmington.froilansfarm.Edible.Vegetable;
import com.zipcodewilmington.froilansfarm.Crop.Produce;
import com.zipcodewilmington.froilansfarm.Persons.Animal;

public class Chicken extends Animal<Vegetable> implements Produce<Egg> {
    public boolean isHasBeenFertilized() {
        return false;
    }

    public void setHasBeenFertilized(boolean b) {
    }

    public String makeNoise() {
        return "Cluck";
    }

    public <EdibleEgg> EdibleEgg yield() {
        return null;
    }

    @Override
    public void yeild() {

    }

    @Override
    public void hasBeenHarvested() {

    }

    @Override
    public void eat(Edible edible) {

    }
}
