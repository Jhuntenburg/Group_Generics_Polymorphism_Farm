package com.zipcodewilmington.froilansfarm.DayTests;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Edible.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible.Egg;
import com.zipcodewilmington.froilansfarm.Edible.Tomato;
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
    public void breakfastFroilandaTest() {
        Froilanda froilanda = new Froilanda();
        EarCorn earcorn = new EarCorn();
        Tomato tomato1 = new Tomato();
        Tomato tomato2 = new Tomato();
        Egg egg1 = new Egg();
        Egg egg2 = new Egg();

        froilanda.eat(earcorn);
        froilanda.eat(tomato1);
        froilanda.eat(tomato2);
        froilanda.eat(egg1);
        froilanda.eat(egg2);

        Assert.assertTrue(froilanda.getIsFed());

    }
    @Test
    public void breakFastFroilandTest() {

        Froilan froilan = new Froilan();
        EarCorn earcorn = new EarCorn();
        EarCorn earcorn2 = new EarCorn();
        Tomato tomato1 = new Tomato();
        Egg egg1 = new Egg();
        Egg egg2 = new Egg();
        Egg egg3 = new Egg();
        Egg egg4 = new Egg();
        Egg egg5 = new Egg();


        froilan.eat(earcorn);
        froilan.eat(earcorn2);
        froilan.eat(tomato1);
        froilan.eat(egg1);
        froilan.eat(egg2);
        froilan.eat(egg3);
        froilan.eat(egg4);
        froilan.eat(egg5);

        Assert.assertTrue(froilan.getIsFed());
    }


}
