package com.zipcodewilmington.froilansfarm.Edible;


import Edible.Edible;
import org.junit.Assert;
import org.junit.Test;

public class EdibleInterfaceTest {

    @Test

    public void instanceOfEdibleTest (){

        Assert.assertTrue(Vegetable instanceof Edible);
    }

}
