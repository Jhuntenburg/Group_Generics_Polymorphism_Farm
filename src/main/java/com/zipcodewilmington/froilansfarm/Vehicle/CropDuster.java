package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import com.zipcodewilmington.froilansfarm.Rideable;

public class CropDuster extends Vehicle implements Rideable, FarmVehicle, AirCraft {


    public CropDuster(){super();}

    public CropDuster(Rider operator) {
        super(operator);
    }


    public void fertalize() {

    }


    @Override
    public String makeNoise() {
        return "NYOOOM";
    }

    @Override
    public void fly() {

    }

    @Override
    public void operateOnFarm() {

    }

    @Override
    public void getMounted(Rider rider) {
        this.operator = rider;
    }
}
