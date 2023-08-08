package com.zipcodewilmington.froilansfarm.DayTests;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Persons.Animal;
import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.Persons.Froilanda;
import com.zipcodewilmington.froilansfarm.StorageUnits.Stables;
import org.junit.Assert;
import org.junit.Test;

public class MorningTest {

    @Test
    public void ridingTest() {
        //Given
        Froilanda pilot = new Froilanda();
        Froilan farmer = new Froilan();

        Stables st = new Stables();
        st.add(new Horse());
        st.add(new Horse());
        st.add(new Horse());
        st.add(new Horse());
        st.add(new Horse());
        st.add(new Horse());

        st.stream().forEach(h -> h.setRidden(true));
        //When

        boolean expectedRidden = true;
        boolean actualRidden = st.stream().allMatch(Horse::getIsRidden);

        //Then

        Assert.assertEquals(expectedRidden, actualRidden);

    }

    @Test
    public void feedingTest() {
        //Given
        Froilanda pilot = new Froilanda();
        Froilan farmer = new Froilan();

        Stables st = new Stables();
        st.add(new Horse());
        st.add(new Horse());
        st.add(new Horse());
        st.add(new Horse());
        st.add(new Horse());
        st.add(new Horse());

        st.stream().forEach(h -> h.setIsFed(true));
        //When

        boolean expectedFed = true;
        boolean actualFed = st.stream().allMatch(Horse::getIsFed);

        //Then
        Assert.assertEquals(expectedFed, actualFed);

    }

    @Test
    public void breakFastTest() {





    }


}
