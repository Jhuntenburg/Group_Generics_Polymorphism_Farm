package com.zipcodewilmington.froilansfarm.Edible;

import Edible.EarCorn;
import Edible.Vegetable;
import org.junit.Assert;
import org.junit.Test;

public class EarCornTest {

    @Test
    public void ecInstanceOfVegetable (){

        Assert.assertTrue(EarCorn instanceof Vegetable);
    }

    @Test
    public void earCornGotEatenTest(){
        //Given
        EarCorn ec = new EarCorn();
        Froilan f= new Froilan();

        //When people eat (under Eater)
        f.eat(tom);

        Assert.assertTrue(ec.gotEaten);

    }

    @Test
    public void tomSetEatenStat(){
        //we make egg its false that its not eata bc just born
        EarCorn ec = new EarCorn();

        //when setting true, checking if its been eaten
        ec.setEatenStatus();

        Assert.assertTrue(ec.gotEaten);

    }




}
