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
        CropRows cropR = new CropRows();

        cropR.add(kStalk);


        Assert.assertTrue(kStalk.getEarCorn() == null);

    }

    @Test
    public void cornHarvestHalfConditionTest() {

        KaleStalk kStalk = new KaleStalk();
        CropRows cropR = new CropRows();

        cropR.add(kStalk);
        kStalk.setHarvested(true);
        kStalk.yeild();

        Assert.assertFalse(kStalk.getFertStatus());
        Assert.assertTrue(kStalk.getHarvested());
        Assert.assertTrue(kStalk.getKale() == null);



    }

    @Test
    public void cornHarvestTest() {

        KaleStalk kStalk = new KaleStalk(false);
        CropRows cropR = new CropRows();

        cropR.add(kStalk);
        kStalk.setFertilized(true);
        kStalk.setHarvested(true);
        kStalk.yeild();

        Assert.assertTrue(kStalk.getFertStatus());
        Assert.assertTrue(kStalk.getHarvested());
        Assert.assertFalse(kStalk.getKale() == null);
    }

}




