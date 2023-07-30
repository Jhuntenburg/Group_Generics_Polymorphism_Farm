package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void instanceOfAnimal() {
        Assert.assertTrue(Person instanceof Animal);
    }

    @Test
    public void instanceOfNoiseMaker() {
        Assert.assertTrue(Person instanceof NoiseMaker);

    }
}
