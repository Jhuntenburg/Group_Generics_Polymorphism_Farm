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

        //Then
        Assert.assertTrue(cropDuster.getOperator() == null);

    }
    @Test
    public void cropDusterGetMountedTest2() {
        //Given
        Froilanda sam = new Froilanda("Sam");
        CropDuster cropDuster = new CropDuster();

        //When
        cropDuster.getMounted(sam);
        Froilanda expectedPerson = sam;
        Froilanda actualPerson = cropDuster.getOperator();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

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

    @Test
    public void makeNoiseTest() {
        //Given
        CropDuster spitFire = new CropDuster();

        //When
        String expected = "NYOOOM";
        String actual = spitFire.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void flyTest() {
        //Given
        CropDuster spitFire = new CropDuster();

        //When
        spitFire.fly();

        //Then
        Assert.assertTrue(spitFire.isFlying);

    }

    @Test
    public void landTest() {
        //Given
        CropDuster spitFire = new CropDuster();

        //When
        spitFire.fly();
        spitFire.land();

        //Then
        Assert.assertFalse(spitFire.isFlying);
    }


}
