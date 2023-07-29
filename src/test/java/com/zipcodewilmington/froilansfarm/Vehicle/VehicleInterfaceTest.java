package com.zipcodewilmington.froilansfarm.Vehicle;

import org.junit.Assert;
import org.junit.Test;

public class VehicleInterfaceTest {
    @Test
    public void isImplementingInterfaceTest1() {
        //Given
        Tractor tractor = new Tractor();

        //When

        //Then
        Assert.assertTrue(tractor instanceof FarmVehicle);

    }

    @Test
    public void isImplementingInterfaceTest2() {
        //Given
        CropDuster cropDuster = new CropDuster();

        //When

        //Then
        Assert.assertTrue(cropDuster instanceof FarmVehicle);

    }


    @Test
    public void vehicleTurnOnEngineTest1() {
        //Given
        CropDuster cropDuster = new CropDuster();

        //When
        cropDuster.turnOnEngine();

        //Then
        Assert.assertTrue(cropDuster.getEngineIsOn());

    }


    @Test
    public void vehicleTurnOnEngineTest2() {
        //Given
        Tractor tractor = new Tractor();

        //When
        tractor.turnOnEngine();

        //Then
        Assert.assertTrue(tractor.getEngineIsOn());
    }

    @Test
    public void vehicleTurnOffEngineTest1() {
        //Given
        CropDuster cropDuster = new CropDuster();

        //When
        cropDuster.turnOnEngine();
        cropDuster.turnOffEngine();

        boolean expectedStatus = false;
        boolean actualStatus = cropDuster.getEngineIsOn();

        //Then
        Assert.assertEquals(expectedStatus, actualStatus);

    }

    @Test
    public void vehicleTurnOffEngineTest2() {
        //Given
        Tractor tractor = new Tractor();

        //When
        tractor.turnOnEngine();
        tractor.turnOffEngine();

        boolean expectedStatus = false;
        boolean actualStatus = tractor.getEngineIsOn();

        //Then
        Assert.assertEquals(expectedStatus, actualStatus);

    }


}



