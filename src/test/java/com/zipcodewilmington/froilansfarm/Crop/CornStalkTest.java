package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.Persons.Froilanda;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void cornPlantHarvestTest(){

        CornStalk cStalk = new CornStalk();










//
//        CornStalk cStalk = new CornStalk();
//        Froilan f= new Froilan();
//        Tractor trac = new Tractor();
//        CropRows cropR = new CropRows();
//
//
//        trac.getMounted(f);
//        cropR.add(cStalk);
//        trac.harvest(cropR);
//        //OR
//      //  f.harvest(cropR); ???
//
//        Assert.assertTrue(cropR.get(0).harvested);

    }

    @Test
    public void cornPlantFertilizationTest(){

        CornStalk cStalk = new CornStalk();
        Froilanda landa= new Froilanda();
        CropDuster cdust = new CropDuster();
        CropRows cropR = new CropRows();


        cdust.getMounted(landa);
        cropR.add(cStalk);
        cdust.fertilize(cropR);


        Assert.assertTrue(cropR.get(0).fertilized);

    }

}
