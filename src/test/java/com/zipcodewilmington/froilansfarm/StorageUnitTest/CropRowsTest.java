package com.zipcodewilmington.froilansfarm.StorageUnitTest;

import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import com.zipcodewilmington.froilansfarm.StorageUnits.StorageUnit;
import org.junit.Assert;
import org.junit.Test;

public class CropRowsTest {




    @Test
    public void addTest(){
        //given
        CropRows cropHouse = new CropRows();
        TomatoPlant tomato = new TomatoPlant(false);
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
        CropRows cropHouse = new CropRows();
        TomatoPlant tomatoPlant = new TomatoPlant(false);
        cropHouse.add(tomatoPlant);
        Integer expected = 0;
        //when
        cropHouse.remove(tomatoPlant);
        Integer actual = cropHouse.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        //given
        CropRows<TomatoPlant> cropHouse = new CropRows();
        TomatoPlant tomatoPlant = new TomatoPlant(false);
        cropHouse.add(tomatoPlant);
        TomatoPlant expected = tomatoPlant;
        //when
        TomatoPlant actual = (TomatoPlant) cropHouse.get(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        //given
        CropRows cropHouse = new CropRows();

        //Then
        Assert.assertTrue(cropHouse.isEmpty());
    }
}
