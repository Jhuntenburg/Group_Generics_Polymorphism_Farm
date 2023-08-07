package com.zipcodewilmington.froilansfarm.Crop;

public abstract class Crop implements Produce {

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

    public void hasBeenHarvested() {
        harvested = true;
    }





}
