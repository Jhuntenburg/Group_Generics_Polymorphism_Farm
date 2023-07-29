package com.zipcodewilmington.froilansfarm.Vehicle;

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
        Person farmerDan = new Person();
        Tractor tractor = new Tractor(farmerDan);

        //When
        Person expectedPerson = farmerDan;
        Person actualPerson = tractor.getOperator();


        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }
    @Test
    public void vehicleSetOperatorTest1() {
        //Given
        Person farmerDan = new Person();
        Person farmerSue = new Person();
        Tractor tractor = new Tractor(farmerDan);

        //When
        tractor.setOperator(farmerSue);

        Person expectedPerson = farmerSue;
        Person actualPerson = tractor.getOperator();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }

    @Test
    public void vehicleSetOperatorTest2() {
        //Given
        Person farmerDan = new Person();
        Person farmerSue = new Person();
        CropDuster cropDuster = new CropDuster(farmerSue);

        //When
        tractor.setOperator(farmerDan);

        Person expectedPerson = farmerDan;
        Person actualPerson = tractor.getOperator();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }



}
