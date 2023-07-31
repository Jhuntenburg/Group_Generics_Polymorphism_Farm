package com.zipcodewilmington.froilansfarm.Persons;

import Edible.Edible;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import com.zipcodewilmington.froilansfarm.StorageUnits.Pantry;

public class Froilan extends Person implements Botanist, Farmer, Rider{

    int eatenfood=0;

    public Froilan(){

    }
    public Froilan(String name) {
        super(name);
    }

    @Override
    public void plants(CropRows cropRows, Crop crop) {

        cropRows.add(crop);
    }

//    @Override
//    public void eat(Edible edible) {
//        Pantry.remove(edible);
//         eatenfood ++;
//
//    }

    @Override
    public void feed(Animal animal, Edible edible) {
        animal.eat(edible);



    }

    @Override
    public void mount(Rideable rideable) {
        rideable.getMounted(this);
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.getMounted(null);

    }

    @Override
    public String makeNoise() {
        System.out.println("Where's my Eggs!");
        return "Where's my Eggs!";

    }

    @Override
    public void eat(Edible edible) {
        Pantry.remove(edible);
        eatenfood ++;

    }
}
