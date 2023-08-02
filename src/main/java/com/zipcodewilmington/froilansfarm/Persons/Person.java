package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public abstract class Person extends Animal implements Feeder, Rider<Vehicle> {
    public Person(String name) {
        super(name);
    }

    public Person() {
        super();
    }


}
