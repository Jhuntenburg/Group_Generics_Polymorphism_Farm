package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void tomPlantHarvestTest(){

        CornStalk cStalk = new CornStalk();
        Froilan f= new Froilan();
        Tractor trac = new Tractor();
        CropRows cropR = new CropRows();

        trac.getMounted(f);
        cropR.add(cStalk);
        trac.harvest(cropR);

        Assert.assertTrue(cropR.get(0).harvested);

    }

    @Test
    public void tomPlantFertilizationTest(){

        CornStalk cStalk = new CornStalk();
        Froilanda landa= new Froilanda();
        CropDuster cdust = new CropDuster();
        CropRows cropR = new CropRows();


        cdust.getMounted(landa);
        cropR.add(cStalk);
        cdust.fertilizer(cropR);


        Assert.assertTrue(cropR.get(0).fertilized);

    }

}
