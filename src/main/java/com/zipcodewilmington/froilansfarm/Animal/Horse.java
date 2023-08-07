package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Persons.Animal;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal<EarCorn> implements Rideable<Person> {

    private boolean isRidden = false;
    private Person rider ;
    public void setRider(Person rider) {
        this.rider = rider;

    }

    public Object getRider() {
        return rider;
    }

    public boolean getIsRidden() {
        return isRidden;
    }

    public void setRidden(boolean b) {
        this.isRidden = b;
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
