package Persons;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;

public interface Pilot extends Rider<CropDuster>{

    public void flys(CropDuster cropDuster);
}
