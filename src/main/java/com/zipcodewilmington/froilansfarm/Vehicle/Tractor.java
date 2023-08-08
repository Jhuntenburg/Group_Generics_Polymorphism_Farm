package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Edible.Vegetable;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;

public class Tractor extends Vehicle implements FarmVehicle{


    public Tractor(){super();}

    public Tractor(Rider operator) {
        super(operator);
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
        for (Object c : cropRows) { if (c instanceof Crop) { ((Crop) c).setHarvested(true); } }
    }


}
