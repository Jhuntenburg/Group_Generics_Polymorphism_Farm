package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Persons.Froilanda;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import com.zipcodewilmington.froilansfarm.Rideable;

public class CropDuster extends Vehicle<Froilanda> implements Rideable<Froilanda>, FarmVehicle, AirCraft {


    private Rider rider;

    public CropDuster(){super();}

    public CropDuster(Froilanda operator) {
        super(operator);
    }

    @Override
    public void getMounted(Froilanda rider) {

        this.rider = rider;
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


}
