package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void instanceOfStorageUnitTest(){
        Assert.assertTrue(FarmField instanceof StorageUnit);
    }

    @Test
    public void addTest(){
        //given
        FarmField field = new FarmField();
        Croprow<CornStalk> croprow = new CropRow<>();
        Integer expected = 1;
        //when
        field.add(croprow);
        Integer actual = field.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        //given
        FarmField field = new FarmField();
        Croprow<CornStalk> croprow = new CropRow<>();
        field.add(croprow);
        Integer expected = 0;
        //when
        field.remove(croprow);
        Integer actual = field.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        //given
        FarmField field = new FarmField();
        Croprow<CornStalk> croprow = new CropRow<>();
        field.add(croprow);
        CropRow<CornStalk> expected = croprow;
        //when
        CropRow<CornStalk> actual = field.get(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        //given
        FarmField field = new FarmField();

        //Then
        Assert.assertTrue(field.isEmpty());
    }
}
