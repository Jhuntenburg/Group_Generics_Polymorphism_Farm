package com.zipcodewilmington.froilansfarm.Vehicle;

import Persons.Froilan;
import Persons.Person;
import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void vehicleNullConstructorTest1() {
        //Given
        CropDuster cropDuster = new CropDuster();

        //When
        Person expectedPerson = null;
        Person actualPerson = cropDuster.getOperator();
        boolean expectedEngineStatus = false;
        boolean actualEngineStatus = cropDuster.getEngineStatus();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);
        Assert.assertEquals(expectedEngineStatus, actualEngineStatus);

    }
    @Test
    public void vehicleNullConstructorTest2() {
        //Given
        Tractor tractor = new Tractor();

        //When
        Person expectedPerson = null;
        Person actualPerson = tractor.getOperator();
        boolean expectedEngineStatus = false;
        boolean actualEngineStatus = tractor.getEngineStatus();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);
        Assert.assertEquals(expectedEngineStatus, actualEngineStatus);

    }
    @Test
    public void vehicleOperatorConstructorTest() {
        //Given
        Person dan = new Froilan("Dan");
        Tractor tractor = new Tractor(dan);

        //When
        Person expectedPerson = dan;
        Person actualPerson = tractor.getOperator();


        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }
    @Test
    public void vehicleSetOperatorTest1() {
        //Given
        Person dan = new Froilan("Dan");
        Person sue = new Froilan("Sue");
        Tractor tractor = new Tractor(dan);

        //When
        tractor.setOperator(sue);

        Person expectedPerson = sue;
        Person actualPerson = tractor.getOperator();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }

    @Test
    public void vehicleSetOperatorTest2() {
        //Given
        Person dan = new Froilan("Dan");
        Person sue = new Froilan("Sue");
        CropDuster cropDuster = new CropDuster(sue);

        //When
        cropDuster.setOperator(dan);

        Person expectedPerson = dan;
        Person actualPerson = cropDuster.getOperator();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }



}
