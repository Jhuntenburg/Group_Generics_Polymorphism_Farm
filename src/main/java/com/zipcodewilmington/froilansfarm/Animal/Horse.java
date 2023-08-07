package com.zipcodewilmington.froilansfarm.Animal;

import Edible.Edible;
import com.zipcodewilmington.froilansfarm.Persons.Animal;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal<EarCorn> implements Rideable<Person> {
    public void setRider(Person rider) {
    }

    public Object getRider() {
        return null;
    }

    public boolean isRidden() {
        return false;
    }

    public void setRidden(boolean b) {
    }

    public boolean isMounted() {
        return false;
    }

    public void setMounted(boolean b) {
    }

    public String makeNoise() {
        return "Whinny";
    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void getMounted(Person rider) {

    }

}
