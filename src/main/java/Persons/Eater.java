package Persons;

public interface Eater<Food extends Edible>{
    public default void eat(){

    }

}
