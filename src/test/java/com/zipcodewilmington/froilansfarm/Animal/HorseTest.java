package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Persons.Froilan;
import com.zipcodewilmington.froilansfarm.Persons.Froilanda;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HorseTest {
    private Horse horse;
    @Before
    public void setUp() {
        horse = new Horse();
    }

    @Test
    public void testRiderFroilan() {
        // given
        Froilan rider = new Froilan("Froilan");
        Horse horse = new Horse();
        // when
        horse.setRider(rider);
        // then
        assertEquals(rider, horse.getRider());
        }

    @Test
    public void testRiderFroilanda() {
        // given
        Froilanda rider = new Froilanda("Froilanda");
        Horse horse = new Horse();
        // when
        horse.setRider(rider);
        // then
        assertEquals(rider, horse.getRider());
    }

    @Test
    public void testRidden() {
        Horse horse = new Horse();
        // given
        assertFalse(horse.getIsRidden());
        // when
        horse.setRidden(true);
        // then
        assertTrue(horse.getIsRidden());
    }
    @Test
    public void testMounted() {
        Horse horse = new Horse();
        // given
        assertFalse(horse.getIsRidden());
        // when
        horse.setRidden(true);
        // then
        assertTrue(horse.getIsRidden());
    }

    @Test
    public void makeNoise() {
        String expected = "Whinny";
        String actual = horse.makeNoise();
        Assert.assertEquals(expected, actual);
    }
}
