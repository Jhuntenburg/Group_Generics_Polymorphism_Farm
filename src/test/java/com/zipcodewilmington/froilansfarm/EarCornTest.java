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

}
