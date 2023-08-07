package com.zipcodewilmington.froilansfarm.Crop;

public abstract class Crop implements Produce {

    public Crop() {
    }

    boolean harvested = false;
    boolean fertilized = false;

    public Crop() {
    }

    public void setHarvested(boolean harvested) {
        this.harvested = harvested;
    }

    public void setFertilized(boolean fertilized) {
        this.fertilized = fertilized;
    }

    public boolean hasBeenFertilized() {return fertilized;}

    public void hasBeenHarvested() {
        harvested = true;
    }

    public boolean getHarvested() {return harvested;}





}
