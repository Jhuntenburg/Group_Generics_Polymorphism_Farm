package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;

public class EarCornTest {

    public void ecInstanceOfVegetable (){
        Assert.assertTrue(EarCorn instanceof Vegetable);
    }

    public void earCornGotEatenTest(){
        //Given
        EarCorn ec = new EarCorn();
        Froilan f= new Froilan();

        //When people eat (under Eater)
        f.eat(tom);

        Assert.assertTrue(tom.gotEaten());

    }

    public void tomSetEatenStat(){
        //we make egg its false that its not eata bc just born
        EarCorn ec = new EarCorn();

        //when setting true, checking if its been eaten
        ec.setEatenStatus();

        Assert.assertTrue(ec.gotEaten);

    }




}
