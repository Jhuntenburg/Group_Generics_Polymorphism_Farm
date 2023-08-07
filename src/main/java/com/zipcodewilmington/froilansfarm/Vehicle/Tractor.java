package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Edible.Vegetable;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;

public class Tractor extends Vehicle implements FarmVehicle{


    public Tractor(){super();}

    public Tractor(Rider operator) {
        super(operator);
    }

    public Vegetable harvest(CropRows cropRow) {
        if (engineIsOn && operator != null) {
            //cropRow.get(cropRow.getCrop);
            return null;
        }
        System.out.println("The engine is off!");
        return null;
        //Maybe return an array?
        //Clone then empty?
    }

    public Rider getOperator() {
        return this.operator;
    }



    @Override
    public String makeNoise() {
        return "VROOM";
    }



    @Override
    public void getMounted(Rider rider) {
        this.operator = rider;
    }

    @Override
    public void operateOnFarm(CropRows cropRows) {

    }
}
