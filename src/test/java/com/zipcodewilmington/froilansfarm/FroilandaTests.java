package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible.Egg;
import com.zipcodewilmington.froilansfarm.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Persons.*;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class FroilandaTests {

    @Test
    public void instanceOfRiderTest() {
        Froilanda froilanda = new Froilanda();

        Assert.assertTrue(froilanda instanceof Rider);
    }

    @Test
    public void instanceOfEaterTest() {
        Froilanda froilanda = new Froilanda();

        Assert.assertTrue(froilanda instanceof Eater);
    }

    @Test
    public void instanceOfPilot() {
        Froilanda froilanda = new Froilanda();

        Assert.assertTrue(froilanda instanceof Pilot);
    }

    @Test
    public void instanceOfPerson() {
        Froilanda froilanda = new Froilanda();

        Assert.assertTrue(froilanda instanceof Person);
    }

    @Test
    public void instanceOfAnimal() {
        Froilanda froilanda = new Froilanda();
        Assert.assertTrue(froilanda instanceof Animal);
    }


//    @Test
//    public void flysTest() {
//        Froilanda froilanda = new Froilanda();
//        CropDuster cropduster = new CropDuster();
//
//        froilanda.mount(cropduster);
//        froilanda.flys(cropduster);
//
//        Assert.assertTrue(cropduster.getOperator == (froilanda));
//    }
    

    @Test
    public void mountTest() {
        Froilanda froilanda = new Froilanda();
        CropDuster cropduster = new CropDuster();

        froilanda.mount(cropduster);
        Rider expected = froilanda;
        Rider actual = cropduster.getOperator();

        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void feedTest() {
//        Froilanda froilanda = new Froilanda();
//        Chicken chicken1 = new Chicken();
//        EarCorn earcorn = new EarCorn();
//
//        froilanda.feed(chicken1, earcorn);
//
//        Assert.assertTrue(chicken1.eat(earcorn));
//
//    }

    @Test
    public void makeNoiseTest() {
        Froilanda froilanda = new Froilanda();

        String expected = "Look out below!";
        String actual = froilanda.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        Froilanda froilanda = new Froilanda();
        EarCorn earcorn = new EarCorn();
        Tomato tomato1 = new Tomato();
        Tomato tomato2 = new Tomato();
        Egg egg1 = new Egg();
        Egg egg2 = new Egg();

        froilanda.eat(earcorn);
        froilanda.eat(tomato1);
        froilanda.eat(tomato2);
        froilanda.eat(egg1);
        froilanda.eat(egg2);

        Assert.assertTrue(froilanda.getIsFed());
    }


}
