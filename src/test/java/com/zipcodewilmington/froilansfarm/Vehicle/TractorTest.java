package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.Persons.Person;
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
        Froilan froilan = new Froilan("Froilan");
        Tractor tractor = new Tractor();

        //When
        tractor.getMounted(froilan);

        //Then
        Assert.assertTrue(tractor.getOperator() != null);
    }

    @Test
    public void tractorGetMountedTest2() {
        //Given
        Froilan froilan = new Froilan("Froilan");
        Tractor tractor = new Tractor();
        tractor.getMounted(froilan);

        //When
        Person expectedPerson = froilan;
        Person actualPerson = tractor.getOperator();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }


}
