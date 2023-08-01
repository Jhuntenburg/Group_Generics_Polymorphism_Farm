package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.StorageUnits.Pantry;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;

public class Froilanda extends Person implements Rider, Pilot{
    int eatenfood=0;

    public Froilanda(){

    }

    public Froilanda(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        System.out.println("Look out below!");

        return "Look out below!";
    }

    @Override
    public void eat(Edible edible) {
        Pantry.remove(edible);
        eatenfood ++;

    }

    @Override
    public void feed(Animal animal, Edible edible) {
        animal.eat(edible);

    }

    @Override
    public void flys(CropDuster cropDuster) {
        cropDuster.fly();

    }

    @Override
    public void mount(Rideable rideable) {
        rideable.getMounted(this);
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.getMounted(null);
    }
}
