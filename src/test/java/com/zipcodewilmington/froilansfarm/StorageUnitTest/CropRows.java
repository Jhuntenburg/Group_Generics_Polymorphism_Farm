package com.zipcodewilmington.froilansfarm.StorageUnitTest;

import org.junit.Assert;
import org.junit.Test;

public class CropRowsTest {



    @Test
    public void instanceOfStorageUnitTest(){
        Assert.assertTrue(CropRows instanceof StorageUnit);
    }

    @Test
    public void addTest(){
        //given
        CropRow cropHouse = new CropRow();
        TomatoPlant tomato = new TomatoPlant();
        Integer expected = 1;
        //when
        cropHouse.add(tomato);
        Integer actual = cropHouse.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        //given
        CropRow cropHouse = new CropRow();
        TomatoPlant tomato = new TomatoPlant();
        cropHouse.add(tomato);
        Integer expected = 0;
        //when
        cropHouse.remove(tomato);
        Integer actual = cropHouse.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        //given
        CropRow cropHouse = new CropRow();
        TomatoPlant tomato = new TomatoPlant();
        cropHouse.add(tomato);
        TomatoPlant expected = tomato;
        //when
        TomatoPlant actual = tomato.get(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        //given
        CropRow cropHouse = new CropRow();

        //Then
        Assert.assertTrue(cropHouse.isEmpty());
    }
}
