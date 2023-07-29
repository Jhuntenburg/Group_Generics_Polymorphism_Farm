package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void tomPInstanceOfCrop (){
        Assert.assertTrue(TomatoPlant instanceof Crop);
    }



public void tomPlantHarvestTest(){


    public void tomPlantHarvestTest(){

        TomatoPlant tomPlant = new TomatoPlant();
        Froilan f= new Froilan();
        Tractor trac = new Tractor();
        CropRows cropR = new CropRows();

        trac.getMounted(f);
        cropR.add(tomPlant);
        trac.harvest(cropR);

        Assert.assertTrue(cropR.get(0).harvested);

    }

    public void tomPlantFertilizationTest(){

        TomatoPlant tomPlant = new TomatoPlant();
        Froilanda landa= new Froilanda();
        CropDuster cdust = new CropDuster();
        CropRows cropR = new CropRows();


        cdust.getMounted(landa);
        cropR.add(tomPlant);
        cdust.fertilizer(cropR);


        Assert.assertTrue(cropR.get(0).fertilized);

    }
}