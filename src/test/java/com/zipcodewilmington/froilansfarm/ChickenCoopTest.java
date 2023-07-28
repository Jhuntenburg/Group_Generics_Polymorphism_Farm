package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    @Test
    public void instanceOfStorageUnitTest(){
        Assert.assertTrue(ChickenCoop instanceof StorageUnit);
    }

    @Test
    public void addTest(){
        //given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        Integer expected = 1;
        //when
        chickenCoop.add(chicken);
        Integer actual = chickenCoop.size();
        //then
        Assert.assertEquals();
    }
}
