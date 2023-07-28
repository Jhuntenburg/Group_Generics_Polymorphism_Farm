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

    public void tomSetEatenStat(){
        //we make egg its false that its not eata bc just born
        Tomato tom = new Tomato();

        //when setting true, checking if its been eaten
        tom.setEatenStatus();

        Assert.assertTrue(tom.gotEaten);

    }




}
