package com.zipcodewilmington.froilansfarm.Edible;

import org.junit.Assert;
import org.junit.Test;

public class KaleTest {

    @Test
    public void kInstanceOfVegetable (){
        Kale kale = new Kale();

        Assert.assertTrue(kale instanceof Vegetable);
    }

//    @Test
//    public void kaleGotEatenTest(){
//        //Given
//        Kale kale = new Kale();
//        Froilan f= new Froilan();
//
//        //When people eat (under Eater)
//        f.eat(kale);
//
//        Assert.assertTrue(kale.gotEaten());
//
//    }

    @Test
    public void tomSetEatenStat(){
        //we make egg its false that its not eata bc just born
        Kale kale = new Kale();

        //when setting true, checking if its been eaten
        kale.setEatenStatus();

        Assert.assertTrue(kale.gotEaten);

    }




}
