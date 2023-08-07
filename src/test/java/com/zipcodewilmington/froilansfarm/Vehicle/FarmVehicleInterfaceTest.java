package com.zipcodewilmington.froilansfarm.Vehicle;

import org.junit.Assert;
import org.junit.Test;

public class FarmVehicleInterfaceTest {

    @Test
    public void isImplementingInterfaceTest(){
        //Given
        Tractor tractor = new Tractor();

        //When

        //Then
        Assert.assertTrue(tractor instanceof FarmVehicle);

    }

}
