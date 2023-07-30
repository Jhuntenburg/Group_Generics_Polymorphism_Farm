package com.zipcodewilmington.froilansfarm.Animal;

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
    public void testRider() {
        // given
        Person rider = new Person("Froilan");
        Horse horse = new Horse();
        // when
        horse.setRider(rider);
        // then
        assertEquals(rider, horse.getRider());
        }

    @Test
    public void testRider() {
        // given
        Person rider = new Person("Froilanda");
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
        assertFalse(horse.isRidden());
        // when
        horse.setRidden(true);
        // then
        assertTrue(horse.isRidden());
    }
    @Test
    public void testMounted() {
        Horse horse = new Horse();
        // given
        assertFalse(horse.isMounted());
        // when
        horse.setMounted(true);
        // then
        assertTrue(horse.isMounted());
    }

    @Test
    public void makeNoise() {
        String expected = "Whinny";
        String actual = horse.makeNoise();
        Assert.assertEquals(expected, actual);
    }
}
