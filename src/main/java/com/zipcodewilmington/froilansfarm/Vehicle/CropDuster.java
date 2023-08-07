package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Persons.Froilanda;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;

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



    @Override
    public String makeNoise() {
        return "NYOOOM";
    }

    @Override
    public void fly() {

    }

    @Override
    public void operateOnFarm(CropRows cropRows) {
        for (Object c : cropRows) {
            if (c instanceof Crop) {
                ((Crop) c).setFertilized(true);
            }
        }

       // cropRows.stream().forEach( c -> c.setFertilized(true));
    }


}
