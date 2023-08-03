package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;

import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void tomPlantInstanceOfCrop (){
        TomatoPlant tp = new TomatoPlant();
        Assert.assertTrue(tp instanceof Crop);
    }




    @Test
    public void tomPlantPlanted1(){

        TomatoPlant tp = new TomatoPlant();
        Froilan f= new Froilan();
        CropRows cropR = new CropRows();

        //when

        f.plants(cropR,tp);

        Assert.assertTrue(cropR.contains(tp));


    }

    @Test
    public void cornStalkPlanted2(){

        TomatoPlant tp = new TomatoPlant();
        Froilan f= new Froilan();
        CropRows cropR = new CropRows();

        //when

        f.plants(cropR,tp);

        Assert.assertFalse(cropR.isEmpty());


    }

}