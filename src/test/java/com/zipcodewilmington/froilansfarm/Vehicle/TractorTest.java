package com.zipcodewilmington.froilansfarm.Vehicle;

import Persons.Froilan;
import Persons.Person;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void tractorExtendsVehicleTest() {
        //Given
        Tractor tractor = new Tractor();

        //When


        //Then
        Assert.assertTrue(tractor instanceof Vehicle);
    }

    @Test
    public void tractorHarvestTest1() {
        //Given
        Tractor tractor = new Tractor();
        CropRow cropRow = new CropRow(Crop);

        //When
        tractor.harvest(Crop cropRow);

        //Then
        Assert.assertEquals(cropRow.isEmpty);
    }

    @Test
    public void tractorGetMountedTest1() {
        //Given
        Person froilan = new Froilan("Froilan");
        Tractor tractor = new Tractor();

        //When
        tractor.getMounted(person);

        //Then
        Assert.assertTrue(tractor.getOperator() != null);
    }

    @Test
    public void tractorGetMountedTest2() {
        //Given
        Person person = new Person();
        Tractor tractor = new Tractor();
        tractor.getMounted(person);

        //When
        Person expectedPerson = person;
        Person actualPerson = tractor.getPerson;

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }


}
