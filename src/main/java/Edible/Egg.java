package Edible;

public class Egg implements Edible{
    boolean gotEaten = false;


    public void setEatenStatus() {

        gotEaten=true;

    }
    @Override
    public boolean isEdible() {
        if(gotEaten){
            return false;
        }
        return true;
    }

}
