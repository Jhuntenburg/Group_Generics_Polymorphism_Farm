package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Edible.Egg;
import com.zipcodewilmington.froilansfarm.Edible.Vegetable;
import com.zipcodewilmington.froilansfarm.Crop.Produce;
import com.zipcodewilmington.froilansfarm.Persons.Animal;

public class Chicken extends Animal<Vegetable> implements Produce<Egg> {

    boolean hasBeenFertilized = false;

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean b) {
        this.hasBeenFertilized = b;
    }

    public String makeNoise() {
        return "Cluck";
    }

    public <EdibleEgg> Egg yield() {

        Egg egg = new Egg();
        if (this.hasBeenFertilized == true) {
            return egg;
        }
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
        this.isFed = true;

    }
}
