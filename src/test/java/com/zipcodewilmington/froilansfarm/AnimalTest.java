package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {


    @Test
    public void instanceOfEaterTest(){
        Assert.assertTrue(Animal instanceof Eater);
    }

    @Test
    public void instanceOfNoiseMakerTest(){
        Assert.assertTrue(Animal instanceof NoiseMaker);
    }








}
