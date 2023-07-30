package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FroilandaTests {

    @Test
    public void instanceOfRiderTest() {
        Assert.assertTrue(Froilanda instanceof Rider);
    }

    @Test
    public void instanceOfEaterTest() {
        Assert.assertTrue(Froilanda instanceof Eater);
    }

    @Test
    public void instanceOfPilot() {
        Assert.assertTrue(Froilanda instanceof Pilot);
    }

    @Test
    public void instanceOfPerson() {
        Assert.assertTrue(Froilanda instanceof Person);
    }

    @Test
    public void instanceOfAnimal() {
        Assert.assertTrue(Froilanda instanceof Animal);
    }



    @Test
    public void flysTest(){
        Froilanda froilanda = new Froilanda();
        CropDuster cropduster = new CropDuster();

        froilanda.mount(cropduster);
        froilanda.flys(cropduster);

        Assert.assertTrue(cropduster.getMounted(froilanda));
    }

    @Test
    public void mountTest() {
        Froilanda froilanda = new Froilanda();
        CropDuster cropduster = new CropDuster();

        froilanda.mount(cropduster);
        String expected = "froilanda";
        String actual = cropduster.getoperator().getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void feedTest() {
        Froilanda froilanda = new Froilanda();
        Chicken chicken1 = new Chicken();
        Earcorn earcorn = new EarCorn();

        froilanda.feed(chicken1, earcorn);

        Assert.assertTrue(chicken1.eat(earcorn));

    }

    @Test
    public void makeNoiseTest() {
        Froilanda froilanda = new Froilanda();

        String expected = "Look out below!";
        String actual = this.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        Froilanda froilanda = new Froilanda();
        Earcorn earcorn = new EarCorn();
        Tomato tomato1 = new Tomato();
        Tomato tomato2 = new Tomato();
        Egg egg1 = new Egg;
        Egg egg2 = new Egg;

        froilanda.eat(earcorn);
        froilanda.eat(tomato1);
        froilanda.eat(tomato2);
        froilanda.eat(egg1);
        froilanda.eat(egg2);

        Assert.assertTrue(froilanda.isFed());
    }


}
