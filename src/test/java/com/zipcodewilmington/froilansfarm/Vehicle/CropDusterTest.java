package com.zipcodewilmington.froilansfarm.Vehicle;

import Persons.Person;
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
        CropRow kaleRow = new CropRow(kaleStalk);

        //When
        cropDuster.fertilizer(kaleRow);

        //Then
        Assert.assertTrue(kaleStalk.fertalized);
    }

    @Test
    public void cropDusterGetMountedTest1() {
        //Given
        Person person = new Person();
        CropDuster cropDuster = new CropDuster();

        //When
        cropDuster.getMounted(person);

        //Then
        Assert.assertTrue(tractor.getPerson != null);


    }

    @Test
    public void cropDusterGetMountedTest2() {
        //Given
        Person person = new Person();
        CropDuster cropDuster = new CropDuster();

        //When
        Person expectedPerson = person;
        Person actualPerson = cropDuster.getPerson;

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);


    }

}
