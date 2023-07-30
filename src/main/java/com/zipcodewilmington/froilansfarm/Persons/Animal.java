package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.NoiseMaker;

public abstract class Animal implements Eater<Food extends Edible>, NoiseMaker {
    public static Boolean isFed;
   private String name;

    public Animal(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Boolean getIsFed() {
        return isFed;
    }

    public static void setIsFed(Boolean isFed) {
        Animal.isFed = isFed;
    }





}
