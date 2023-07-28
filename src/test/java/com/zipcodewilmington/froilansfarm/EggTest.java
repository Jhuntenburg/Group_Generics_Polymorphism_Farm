package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class EggTest {
    @Test

    public void instanceOfEdibleTest (){
        Assert.assertTrue(Egg instanceof Edible);
    }

    public void eggGotEatenTest(){
       //Given
        Egg egg = new Egg();
        Froilan f= new Froilan();

        //When people eat (under Eater)
        f.eat(egg);

        Assert.assertTrue(egg.gotEaten());

    }



}
