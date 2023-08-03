package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Persons.Froilan;

import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void cornStalkInstanceOfCrop (){
        CornStalk cStalk = new CornStalk();
        Assert.assertTrue(cStalk instanceof Crop);
    }

    @Test
    public void cornStalkPlanted1(){

        CornStalk cStalk = new CornStalk();
        Froilan f= new Froilan();
        CropRows cropR = new CropRows();


        f.plants(cropR,cStalk);

        Assert.assertTrue(cropR.contains(cStalk));


    }

    @Test
    public void cornStalkPlanted2(){

        CornStalk cStalk = new CornStalk();
        Froilan f= new Froilan();
        CropRows cropR = new CropRows();

        //when

        f.plants(cropR,cStalk);

        Assert.assertFalse(cropR.isEmpty());


    }



}
