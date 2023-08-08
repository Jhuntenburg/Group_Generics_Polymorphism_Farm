package com.zipcodewilmington.froilansfarm.StorageUnitTest;

import com.zipcodewilmington.froilansfarm.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible.Egg;
import com.zipcodewilmington.froilansfarm.Edible.Kale;
import com.zipcodewilmington.froilansfarm.Edible.Tomato;
import com.zipcodewilmington.froilansfarm.StorageUnits.Pantry;
import com.zipcodewilmington.froilansfarm.StorageUnits.StorageUnit;
import org.junit.Assert;
import org.junit.Test;

public class PantryTest {




    @Test
    public void addTest(){
        //given
        Pantry pantry = new Pantry();
        Egg egg  = new Egg();
        Integer expected = 1;
        //when
        pantry.add(egg);
        Integer actual = pantry.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        //given
        Pantry pantry = new Pantry();
        Egg egg  = new Egg();
        pantry.add(egg);
        Integer expected = 0;
        //when
        pantry.remove(egg);
        Integer actual = pantry.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEggTest(){
        //given
        Pantry pantry = new Pantry();
        Egg egg  = new Egg();
        pantry.getEggList().add(egg);
        Egg expected = egg;
        //when
       Egg actual = pantry.getEggList().get(0);
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getKaleTest(){
        //given
        Pantry pantry = new Pantry();
       Kale kale = new Kale();
        pantry.getKaleList().add(kale);
       Kale expected = kale;
        //when
        Kale actual = pantry.getKaleList().get(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEarCornTest(){
        //given
        Pantry pantry = new Pantry();
        EarCorn corn = new EarCorn();
        pantry.getEarCornList().add(corn);
        EarCorn expected = corn;
        //when
        EarCorn actual = pantry.getEarCornList().get(0);
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getTomatoTest(){
        //given
        Pantry pantry = new Pantry();
        Tomato tomato = new Tomato();
        pantry.getTomatoList().add(tomato);
        Tomato expected = tomato;
        //when
        Tomato actual = pantry.getTomatoList().get(0);
        //then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void isEmptyTest(){
        //given
        Pantry pantry = new Pantry();

        //Then
        Assert.assertTrue(pantry.isEmpty());
    }
}
