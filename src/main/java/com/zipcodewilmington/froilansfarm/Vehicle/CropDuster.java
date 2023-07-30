package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Persons.Person;

public class CropDuster extends Vehicle implements FarmVehicle, AirCraft {


    public CropDuster(){super();}

    public CropDuster(Person operator) {
        super(operator);
    }


    @Override
    public void makeNoise() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void operateOnFarm() {

    }
}
