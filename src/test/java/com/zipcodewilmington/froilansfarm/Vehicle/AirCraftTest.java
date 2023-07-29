package com.zipcodewilmington.froilansfarm.Vehicle;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class AirCraftTest extends TestCase {

    @Test
    public void isImplementingInterfaceTest(){
        //Given
        CropDuster cropDuster = new CropDuster();

        //When

        //Then
        Assert.assertTrue(cropDuster instanceof AirCraft);

    }


}