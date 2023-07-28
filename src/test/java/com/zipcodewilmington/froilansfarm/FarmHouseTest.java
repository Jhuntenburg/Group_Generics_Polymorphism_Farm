package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {


    @Test
    public void instanceOfStorageUnitTest(){
        Assert.assertTrue(FarmHouse instanceof StorageUnit);
    }

    @Test
    public void addTest(){
        //given
       FarmHouse farmHouse = new FarmHouse();
       Froilan froilan = new Froilan();
        Integer expected = 1;
        //when
       farmHouse.add(froilan);
        Integer actual = farmHouse.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        //given
        FarmHouse farmHouse = new FarmHouse();
        Froilan froilan = new Froilan();
        farmHouse.add(froilan);
        Integer expected = 0;
        //when
        farmHouse.remove(froilan);
        Integer actual = farmHouse.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        //given
        FarmHouse farmHouse = new FarmHouse();
        Froilan froilan = new Froilan();
        farmHouse.add(froilan);
        Froilan expected = froilan;
        //when
        Froilan actual = farmHouse.get(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        //given
        FarmHouse farmHouse = new FarmHouse();

        //Then
        Assert.assertTrue(farmHouse.isEmpty());
    }
}
