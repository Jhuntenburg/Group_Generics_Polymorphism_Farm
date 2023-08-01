package Edible;

public class EarCorn extends Vegetable{



    @Override
    public boolean isEdible() {
        if(gotEaten){
            return false;
        }
        return true;
    }
}
