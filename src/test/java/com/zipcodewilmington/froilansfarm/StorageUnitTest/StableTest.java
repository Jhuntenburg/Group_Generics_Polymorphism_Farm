package com.zipcodewilmington.froilansfarm.StorageUnitTest;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.StorageUnits.Stables;
import com.zipcodewilmington.froilansfarm.StorageUnits.StorageUnit;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {
    @Test
    public void instanceOfStorageUnitTest(){
        Stables stables = new Stables();
        Assert.assertTrue(stables instanceof StorageUnit);
    }

//    @Test
//    public void addTest(){
//        //given
//        Stables horseHouse = new Stables();
//        Horse horse = new Horse();
//        Integer expected = 1;
//        //when
//        horseHouse.add(horse);
//        Integer actual = horseHouse.size();
//        //then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void removeTest(){
//        //given
//        Stables horseHouse = new Stables();
//        Horse horse = new Horse();
//        horseHouse.add(horse);
//        Integer expected = 0;
//        //when
//        horseHouse.remove(horse);
//        Integer actual = horseHouse.size();
//        //then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void getTest(){
//        //given
//        Stables horseHouse = new Stables();
//        Horse horse = new Horse();
//        horseHouse.add(horse);
//        Horse expected = horse;
//        //when
//        Horse actual = horseHouse.get(0);
//        //then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void isEmptyTest(){
//        //given
//        Stables horseHouse = new Stables();
//
//        //Then
//        Assert.assertTrue(horseHouse.isEmpty());
//    }
}
