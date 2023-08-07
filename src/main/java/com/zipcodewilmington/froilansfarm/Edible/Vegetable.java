package com.zipcodewilmington.froilansfarm.Edible;

public abstract class Vegetable implements Edible{

    public boolean gotEaten = false;


    public void setEatenStatus() {

       gotEaten=true;

    }


}
