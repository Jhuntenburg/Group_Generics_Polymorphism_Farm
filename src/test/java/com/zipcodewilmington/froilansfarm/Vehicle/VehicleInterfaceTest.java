package com.zipcodewilmington.froilansfarm.Vehicle;

import org.junit.Assert;
import org.junit.Test;

public class VehicleInterfaceTest {
    @Test
    public void isImplementingInterfaceTest1(){
        //Given
        Tractor tractor = new Tractor();

        //When

        //Then
        Assert.assertTrue(tractor instanceof FarmVehicle);

    }
    @Test
    public void isImplementingInterfaceTest2(){
        //Given
        CropDuster cropDuster = new CropDuster();

        //When

        //Then
        Assert.assertTrue(cropDuster instanceof FarmVehicle);

    }


}
