package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class ProduceTest {
    @Test
    public void chickenInstanceOfProduce (){
        Chicken chicken = new Chicken();

        Assert.assertTrue(chicken instanceof Produce);
    }




}
