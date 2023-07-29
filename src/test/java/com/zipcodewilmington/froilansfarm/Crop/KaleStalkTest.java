package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class KaleStalkTest {
    @Test
    public void kaleStalkHarvestTest(){

        KaleStalk kStalk = new KaleStalk();
        Froilan f= new Froilan();
        Tractor trac = new Tractor();
        CropRows cropR = new CropRows();

        trac.getMounted(f);
        cropR.add(kStalk);
        trac.harvest(cropR);

        Assert.assertTrue(cropR.get(0).harvested);

    }
    @Test
    public void kaleStalkFertilizationTest(){

        KaleStalk kStalk = new TomatoPlant();
        Froilanda landa= new Froilanda();
        CropDuster cdust = new CropDuster();
        CropRows cropR = new CropRows();

        cdust.getMounted(landa);
        cropR.add(kStalk);
        cdust.fertilizer(cropR);

        Assert.assertTrue(cropR.get(0).fertilized);

    }



}
