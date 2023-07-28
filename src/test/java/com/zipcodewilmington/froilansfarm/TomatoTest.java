package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;

public class TomatoTest {
    public void tomInstanceOfVegetable (){
        Assert.assertTrue(Tomato instanceof Vegetable);
    }

    public void tomGotEatenTest(){
        //Given
        Tomato tom = new Tomato();
        Froilan f= new Froilan();

        //When people eat (under Eater)
        f.eat(tom);

        Assert.assertTrue(tom.gotEaten());

    }




}
