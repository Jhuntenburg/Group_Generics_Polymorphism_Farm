package com.zipcodewilmington.froilansfarm.Persons;

public abstract class Person extends Animal implements Feeder {
    public Person(String name) {
        super(name);
    }

    public Person() {
        super();
    }
}
