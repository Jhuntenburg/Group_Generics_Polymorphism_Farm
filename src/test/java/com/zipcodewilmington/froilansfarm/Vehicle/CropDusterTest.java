package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Crop.KaleStalk;
import com.zipcodewilmington.froilansfarm.Edible.Kale;
import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.Persons.Froilanda;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void cropDusterExtendsVehicleTest() {
        //Given
        CropDuster cropDuster = new CropDuster();

        //When

        //Then
        Assert.assertTrue(cropDuster instanceof Vehicle);
    }

    @Test
    public void cropDusterGetMountedTest1() {
        //Given
        Froilanda dan = new Froilanda("Dan");
        CropDuster cropDuster = new CropDuster();

        //When
        cropDuster.getMounted(dan);

        //Then
        Assert.assertTrue(cropDuster.getOperator() != null);


    }

    @Test
    public void cropDusterFertilizerFieldTest() {
        //Given
        CropDuster cropDuster = new CropDuster();
        CropRows<KaleStalk> kaleRow = new CropRows();

        //When
        cropDuster.operateOnFarm(kaleRow);
        boolean allFert = true;

        for (KaleStalk k : kaleRow) {
            if (!k.hasBeenFertilized())
                allFert = false;
        }

        //Then
        Assert.assertTrue(allFert);
    }

//    @Test
//    public void cropDusterGetMountedTest1() {
//        //Given
//        Froilan dan = new Froilan("Dan");
//        CropDuster cropDuster = new CropDuster();
//
//        //When
//        cropDuster.getMounted(dan);
//
//        //Then
//        Assert.assertTrue(tractor.getPerson != null);
//
//
//    }

    @Test
    public void cropDusterGetMountedTest2() {
        //Given
        Froilan sam = new Froilan("Sam");
        CropDuster cropDuster = new CropDuster();

        //When
        Rider expectedPerson = sam;
        Rider actualPerson = cropDuster.getOperator();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);


    }

}
