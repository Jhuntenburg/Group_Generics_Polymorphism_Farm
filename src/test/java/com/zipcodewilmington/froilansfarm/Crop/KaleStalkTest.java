package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class KaleStalkTest {

    @Test
    public void kaleStalkInstanceOfCrop (){
        KaleStalk ks = new KaleStalk();
        Assert.assertTrue(ks instanceof Crop);
    }
    @Test
    public void kaleStalkPlanted1(){

        KaleStalk ks = new KaleStalk();
        Froilan f= new Froilan();
        CropRows cropR = new CropRows();


        f.plants(cropR,ks);

        Assert.assertTrue(cropR.contains(ks));


    }

    @Test
    public void kaleStalkPlanted2(){

        KaleStalk ks = new KaleStalk();
        Froilan f= new Froilan();
        CropRows cropR = new CropRows();

        //when

        f.plants(cropR,ks);

        Assert.assertFalse(cropR.isEmpty());


    }




}
