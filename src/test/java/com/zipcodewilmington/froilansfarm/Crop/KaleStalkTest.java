package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.Persons.Froilanda;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class KaleStalkTest {

    @Test
    public void kalePInstanceOfCrop (){

        KaleStalk kStalk = new KaleStalk();
        Assert.assertTrue(kStalk instanceof Crop);
    }


    @Test
    public void kaleNonHarvestTest() {

        CornStalk kStalk = new CornStalk();
        Froilan f = new Froilan();
        Tractor trac = new Tractor();
        Froilanda fa = new Froilanda();
        CropDuster cd = new CropDuster();
        CropRows cropR = new CropRows();


        Assert.assertTrue(kStalk.getEarCorn() == null);

    }

    @Test
    public void cornHarvestHalfConditionTest() {

        CornStalk cStalk = new CornStalk();
        CropRows cropR = new CropRows();

        cropR.add(cStalk);
        cStalk.setHarvested(true);
        cStalk.yeild();

        Assert.assertFalse(cStalk.getFertStatus());
        Assert.assertTrue(cStalk.getHarvested());
        Assert.assertTrue(cStalk.getEarCorn() == null);



    }

    @Test
    public void cornHarvestTest() {

        CornStalk cStalk = new CornStalk();
        CropRows cropR = new CropRows();

        cropR.add(cStalk);
        cStalk.setFertilized(true);
        cStalk.setHarvested(true);
        cStalk.yeild();

        Assert.assertTrue(cStalk.getFertStatus());
        Assert.assertTrue(cStalk.getHarvested());
        Assert.assertFalse(cStalk.getEarCorn() == null);
    }

}




