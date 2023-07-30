package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

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
