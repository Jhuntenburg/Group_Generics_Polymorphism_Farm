package com.zipcodewilmington.froilansfarm.Edible;


import Edible.Edible;
import org.junit.Assert;
import org.junit.Test;
import Edible.Tomato;
import Edible.Vegetable;
import Edible.EarCorn;
import Edible.Kale;
import Edible.Egg;
public class EdibleInterfaceTest {

    @Test
    public void tomInstanceOfEdibleTest (){
        Tomato tom = new Tomato();

        Assert.assertTrue(tom instanceof Edible);
    }


    @Test
    public void ecInstanceOfEdibleTest (){
        EarCorn ec = new EarCorn();

        Assert.assertTrue(ec instanceof Edible);
    }


    @Test
    public void kaleInstanceOfEdibleTest (){
        Kale kale = new Kale();

        Assert.assertTrue(kale instanceof Edible);
    }


    @Test
    public void eggInstanceOfEdibleTest (){
        Egg egg = new Egg();

        Assert.assertTrue(egg instanceof Edible);
    }



}
