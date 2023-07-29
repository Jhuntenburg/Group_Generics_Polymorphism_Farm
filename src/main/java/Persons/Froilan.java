package Persons;

import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;

public class Froilan extends Person implements Botanist, Farmer, Rider{
    public Froilan(String name) {
        super(name);
    }

    @Override
    public void plants(CropRows cropRows, Crop crop) {
        Botanist.super.plants(cropRows, crop);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void feed(Animal animal, Edible edible) {

    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void dismount(Rideable rideable) {

    }
}
