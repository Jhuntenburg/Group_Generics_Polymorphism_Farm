package com.zipcodewilmington.froilansfarm;

import Edible.EarCorn;
import Edible.Egg;
import Edible.Tomato;
import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Persons.*;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FroilanTests {


    @Test
    public void instanceOfRiderTest() {
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Rider);
    }

    @Test
    public void instanceOfEaterTest() {
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Eater);
    }

    @Test
    public void instanceOfBotanist() {
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Botanist);
    }

    @Test
    public void instanceOfPerson() {
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Person);
    }

    @Test
    public void instanceOfAnimal() {
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Animal);
    }

    @Test
    public void instanceOfFarmer() {
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Farmer);
    }

    @Test
    public void feedTest() {
        Froilan froilan = new Froilan;
        Chicken chicken1 = new Chicken;
        EarCorn earcorn = new EarCorn();

        froilan.feed(chicken1, earcorn);

        Assert.assertTrue(chicken1.eat(earcorn));

    }

    @Test
    public void makeNoiseTest() {
        Froilan froilan = new Froilan();

        String expected = "Where's my Eggs!";
        String actual = froilan.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        Froilan froilan = new Froilan();
        EarCorn earcorn = new EarCorn();
        EarCorn earcorn2 = new EarCorn();
        Tomato tomato1 = new Tomato();
        Egg egg1 = new Egg();
        Egg egg2 = new Egg();
        Egg egg3 = new Egg();
        Egg egg4 = new Egg();
        Egg egg5 = new Egg();


        froilan.eat(earcorn);
        froilan.eat(earcorn2);
        froilan.eat(tomato1);
        froilan.eat(egg1);
        froilan.eat(egg2);
        froilan.eat(egg3);
        froilan.eat(egg4);
        froilan.eat(egg5);

        Assert.assertTrue(froilan.isFed());
    }

    @Test
    public void plantsTest() {
        Froilan froilan = new Froilan();
        CropRows row1 = new CropRows();

        froilan.plants(row1, CornStalk);


        Assert.assertTrue(row1.contains(CornStalk));

    }

    @Test
    public void mountTest() {
        Froilan froilan = new Froilan();
        Tractor tractor = new Tractor();

        froilan.mount(tractor);
        String expected = "Froilan";
        String actual = tractor.operator.getName();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void dismountTest() {
        Froilan froilan = new Froilan();
        Tractor tractor = new Tractor();

        froilan.mount(tractor);
        Person expected = tractor.getOperator();
        froilan.dismount(tractor);
        Person actual = tractor.getOperator();

        Assert.assertNotEquals(expected, actual);
    }


}
