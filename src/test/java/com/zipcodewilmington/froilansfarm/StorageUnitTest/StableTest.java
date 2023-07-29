package com.zipcodewilmington.froilansfarm.StorageUnitTest;

import org.junit.Assert;
import org.junit.Test;

public class StableTest {
    @Test
    public void instanceOfStorageUnitTest(){
        Assert.assertTrue(Stable instanceof StorageUnit);
    }

    @Test
    public void addTest(){
        //given
        Stable horseHouse = new Stable();
        Horse horse = new Horse();
        Integer expected = 1;
        //when
        horseHouse.add(horse);
        Integer actual = horseHouse.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        //given
        Stable horseHouse = new Stable();
        Horse horse = new Horse();
        horseHouse.add(horse);
        Integer expected = 0;
        //when
        horseHouse.remove(horse);
        Integer actual = horseHouse.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        //given
        Stable horseHouse = new Stable();
        Horse horse = new Horse();
        horseHouse.add(horse);
        Horse expected = horse;
        //when
        Horse actual = horseHouse.get(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        //given
        Stable horseHouse = new Stable();

        //Then
        Assert.assertTrue(horseHouse.isEmpty());
    }
}
