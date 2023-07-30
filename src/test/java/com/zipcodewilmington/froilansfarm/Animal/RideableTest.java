package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Test;

public class RideableTest {

    @Test
    public void getRideable() {
        // Given
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        // When
        farmer.mount(horse);
        Rideable rideable = farmer.getRideable();

        // Then
        Assert.assertNotNull(rideable);

    }

    @Test
    public void getRideableNull() {
        // Given
        Farmer farmer = new Farmer();

        // When
        Rideable rideable = farmer.getRideable();

        // Then
        Assert.assertNull(rideable);

    }


   @Test
    public void mount() {
        //Given
        Farmer farmer = new Farmer();

        // When
        Rideable rideable = new Horse();
        farmer.mount(rideable);
        Rideable actual = farmer.getRideable();


        // Then
        Assert.assertEquals(rideable, actual);
    }

}
