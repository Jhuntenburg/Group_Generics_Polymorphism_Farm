package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.Persons.Froilanda;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void vehicleNullConstructorTest1() {
        //Given
        CropDuster cropDuster = new CropDuster();

        //When
        Rider expectedPerson = null;
        Rider actualPerson = cropDuster.getOperator();
        boolean expectedEngineStatus = false;
        boolean actualEngineStatus = cropDuster.getEngineStatus();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);
        Assert.assertEquals(expectedEngineStatus, actualEngineStatus);

    }
    @Test
    public void vehicleNullConstructorTest2() {
        //Given
        Tractor tractor = new Tractor();

        //When
        Rider expectedPerson = null;
        Rider actualPerson = tractor.getOperator();
        boolean expectedEngineStatus = false;
        boolean actualEngineStatus = tractor.getEngineStatus();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);
        Assert.assertEquals(expectedEngineStatus, actualEngineStatus);

    }
    @Test
    public void vehicleOperatorConstructorTest() {
        //Given
        Froilan dan = new Froilan("Dan");
        Tractor tractor = new Tractor(dan);

        //When
        Rider expectedPerson = dan;
        Rider actualPerson = tractor.getOperator();


        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }
    @Test
    public void vehicleSetOperatorTest1() {
        //Given
        Froilan dan = new Froilan("Dan");
        Froilan sue = new Froilan("Sue");
        Tractor tractor = new Tractor(dan);

        //When
        tractor.setOperator(sue);

        Rider expectedPerson = sue;
        Rider actualPerson = tractor.getOperator();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }

    @Test
    public void vehicleSetOperatorTest2() {
        //Given
        Froilanda sue = new Froilanda("Sue");
        CropDuster cropDuster = new CropDuster(sue);

        //When
        cropDuster.setOperator(sue);

        Person expectedPerson = sue;
        Rider actualPerson = cropDuster.getOperator();

        //Then
        Assert.assertEquals(expectedPerson, actualPerson);

    }



}
