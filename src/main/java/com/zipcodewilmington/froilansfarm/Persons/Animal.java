package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

public abstract class Animal<FoodType extends Edible> implements Eater<Edible>, NoiseMaker {
    public Boolean isFed = false;
   private String name;

    public Animal(String name) {
        this.name = name;

    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsFed() {
        return isFed;
    }

    public  void setIsFed(Boolean isFed) {
        this.isFed = isFed;
    }





}
