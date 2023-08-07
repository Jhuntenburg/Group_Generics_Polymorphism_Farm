package com.zipcodewilmington.froilansfarm.Edible;

public class Kale extends Vegetable {


    @Override
    public boolean isEdible() {
        if(gotEaten){
            return false;
        }
        return true;
    }


}
