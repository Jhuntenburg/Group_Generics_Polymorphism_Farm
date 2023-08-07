package com.zipcodewilmington.froilansfarm.Edible;

public class Tomato extends Vegetable{
    @Override
    public boolean isEdible() {
        if(gotEaten){
            return false;
        }
        return true;
    }
}
