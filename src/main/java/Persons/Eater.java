package Persons;

public interface Eater<Food extends Edible>{
    public void eat(Edible edible);



}
