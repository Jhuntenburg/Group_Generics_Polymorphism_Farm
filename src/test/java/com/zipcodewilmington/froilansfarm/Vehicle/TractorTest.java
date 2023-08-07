package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.KaleStalk;
import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void tractorExtendsVehicleTest() {
        //Given
        Tractor tractor = new Tractor();

        //When


        //Then
        Assert.assertTrue(tractor instanceof Vehicle);
    }


    @Test
    public void tractorOperateOnfarmTest1() {
        //Given
        CropDuster cropDuster = new CropDuster();
        CropRows<CornStalk> cornRow = new CropRows();

        //When
        cropDuster.operateOnFarm(cornRow);
        boolean allHarv = true;
        for (CornStalk c : cornRow) {
            if (c.getHarvested())
                allHarv = false;
        }

        //Then
        Assert.assertTrue(allHarv);
    }


    @Test
    public void tractorGetMountedTest1() {
        //Given
        Froilan froilan = new Froilan("Froilan");
        Tractor tractor = new Tractor();

        //When
        tractor.getMounted(froilan);

        //Then
        Assert.assertTrue(tractor.getOperator() != null);
    }

    @Test
    public void tractorGetMountedTest2() {
        //Given
        Froilan froilan = new Froilan("Froilan");
        Tractor tractor = new Tractor();
        tractor.getMounted(froilan);

        //When
        Rider expectedPerson = froilan;
        Rider actualPerson = tractor.getOperator();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }
    @Test
    public void makeNoiseTest() {
        //Given
        Tractor mater = new Tractor();

        //When
        String expected = "VROOM";
        String actual = mater.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);

    }




}
