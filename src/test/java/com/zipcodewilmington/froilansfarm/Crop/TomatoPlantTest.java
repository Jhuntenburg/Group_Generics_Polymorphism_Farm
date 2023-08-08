package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.Persons.Froilanda;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void tomPInstanceOfCrop (){

        TomatoPlant tom = new TomatoPlant();
        Assert.assertTrue(tom instanceof Crop);
    }


    @Test
    public void tomNonHarvestTest() {

        TomatoPlant tPlant = new TomatoPlant();


        Assert.assertTrue(tPlant.getTomato() == null);

    }

    @Test
    public void cornHarvestHalfConditionTest() {

        TomatoPlant tPlant = new TomatoPlant();
        CropRows cropR = new CropRows();

        cropR.add(tPlant);
        tPlant.setHarvested(true);
        tPlant.yeild();

        Assert.assertFalse(tPlant.getFertStatus());
        Assert.assertTrue(tPlant.getHarvested());
        Assert.assertTrue(tPlant.getTomato() == null);



    }

    @Test
    public void cornHarvestTest() {

        TomatoPlant tPlant = new TomatoPlant();
        CropRows cropR = new CropRows();

        cropR.add(tPlant);
        tPlant.setFertilized(true);
        tPlant.setHarvested(true);
        tPlant.yeild();

        Assert.assertTrue(tPlant.getFertStatus());
        Assert.assertTrue(tPlant.getHarvested());
        Assert.assertFalse(tPlant.getTomato() == null);
    }

}