package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void cropDusterExtendsVehicleTest() {
        //Given
        CropDuster cropDuster = new CropDuster();

        //When

        //Then
        Assert.assertTrue(cropDuster instanceof Vehicle);
    }

    @Test
    public void cropDusterFertilizerFieldTest() {
        //Given
        CropDuster cropDuster = new CropDuster();
        CropRows kaleRow = new CropRows();

        //When
        cropDuster.operateOnFarm();

        //Then
        Assert.assertTrue(kaleStalk.fertalized);
    }

//    @Test
//    public void cropDusterGetMountedTest1() {
//        //Given
//        Froilan dan = new Froilan("Dan");
//        CropDuster cropDuster = new CropDuster();
//
//        //When
//        cropDuster.getMounted(dan);
//
//        //Then
//        Assert.assertTrue(tractor.getPerson != null);
//
//
//    }

    @Test
    public void cropDusterGetMountedTest2() {
        //Given
        Froilan sam = new Froilan("Sam");
        CropDuster cropDuster = new CropDuster();

        //When
        Rider expectedPerson = sam;
        Rider actualPerson = cropDuster.getOperator();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);


    }

}
