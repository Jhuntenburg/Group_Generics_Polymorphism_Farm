package com.zipcodewilmington.froilansfarm.Edible;

import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import org.junit.Assert;
import org.junit.Test;

public class EarCornTest {

    @Test
    public void ecInstanceOfVegetable (){
        EarCorn earcorn = new EarCorn();

        Assert.assertTrue(earcorn instanceof Vegetable);
    }

    @Test
    public void earCornGotEatenTest(){
        //Given
        EarCorn ec = new EarCorn();
        Froilan f= new Froilan();

        //When people eat (under Eater)
        f.eat(ec);
        ec.setEatenStatus();

        Assert.assertTrue(ec.gotEaten);

    }

    @Test
    public void tomSetEatenStat(){

        EarCorn ec = new EarCorn();

        //when setting true, checking if its been eaten
        ec.setEatenStatus();

        Assert.assertTrue(ec.gotEaten);

    }




}
