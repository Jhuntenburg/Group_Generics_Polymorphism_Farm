package com.zipcodewilmington.froilansfarm.Edible;

import Edible.Edible;
import Edible.Egg;
import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import org.junit.Assert;
import org.junit.Test;

public class EggTest {
    @Test

    public void instanceOfEdibleTest (){
        Egg egg = new Egg();
        Assert.assertTrue(egg instanceof Edible);
    }

    @Test
    public void eggGotEatenTest(){
       //Given
        Egg egg = new Egg();
        Froilan f= new Froilan();

        //When people eat (under Eater)
        f.eat(egg);

        Assert.assertTrue(egg.gotEaten);

    }

    @Test
    public void eggSetEatenStat(){

        Egg egg = new Egg();

        //when setting true, checking if its been eaten
        egg.setEatenStatus();

        Assert.assertTrue(egg.gotEaten);

    }



}
