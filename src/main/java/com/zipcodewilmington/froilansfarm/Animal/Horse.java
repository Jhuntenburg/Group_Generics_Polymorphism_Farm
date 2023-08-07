package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Persons.Animal;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal<EarCorn> implements Rideable<Person> {

    private Person rider ;
    public void setRider(Person rider) {
        this.rider = rider;

    }

    public Object getRider() {
        return rider;
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
