package com.zipcodewilmington.froilansfarm.Vehicle;

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



}
