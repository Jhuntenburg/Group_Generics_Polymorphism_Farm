//package com.zipcodewilmington.froilansfarm.StorageUnitTest;
//
//import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
//import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
//import com.zipcodewilmington.froilansfarm.StorageUnits.FarmField;
//import com.zipcodewilmington.froilansfarm.StorageUnits.StorageUnit;
//import org.junit.Assert;
//import org.junit.Test;
//
//public class FarmFieldTest {
//
//    @Test
//    public void instanceOfStorageUnitTest(){
//        FarmField field = new FarmField();
//        Assert.assertTrue(field instanceof StorageUnit);
//    }
//
//    @Test
//    public void addTest(){
//        //given
//        FarmField field = new FarmField();
//        CropRows<CornStalk> croprow = new CropRows<>();
//        Integer expected = 1;
//        //when
//        field.add(croprow);
//        Integer actual = field.size();
//        //then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void removeTest(){
//        //given
//        FarmField field = new FarmField();
//        Croprows<CornStalk> croprow = new CropRows<>();
//        field.add(croprow);
//        Integer expected = 0;
//        //when
//        field.remove(croprow);
//        Integer actual = field.size();
//        //then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void getTest(){
//        //given
//        FarmField field = new FarmField();
//        Croprow<CornStalk> croprow = new CropRow<>();
//        field.add(croprow);
//        CropRow<CornStalk> expected = croprow;
//        //when
//        CropRow<CornStalk> actual = field.get(0);
//        //then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void isEmptyTest(){
//        //given
//        FarmField field = new FarmField();
//
//        //Then
//        Assert.assertTrue(field.isEmpty());
//    }
//}
