package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

public class NoiseMakerTest {

    @Test
    public void makeNoise() {
        // given
        String expected = "Cluck";
        // when
        String actual = chicken.makeNoise();
        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void makeNoise() {
        // given
        String expected = "Whinny";
        // when
        String actual = horse.makeNoise();
        // then
        Assert.assertEquals(expected, actual);
    }
}
