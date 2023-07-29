package com.zipcodewilmington.froilansfarm.Vehicle;

import Persons.Person;

public class Tractor extends Vehicle implements FarmVehicle{


    public Tractor(){super();}

    public Tractor(Person operator) {
        super(operator);
    }

    public Vegetable harvest(Crop cropRow) {
        if (this.engineIsOn) {
            cropRow.get(cropRow.getCrop);
            retrun Vegetable;
        }
        System.out.println("The engine is off!");
        return null;
        //Maybe return an array?
        //Clone then empty?
    }

    public Person getOperator() {
        return this.operator;
    }



    @Override
    public void makeNoise() {

    }

    @Override
    public void operateOnFarm() {

    }
}
