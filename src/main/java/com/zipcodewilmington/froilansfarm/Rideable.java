package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Persons.Rider;

public interface Rideable <AnyType extends Rider> {
    void getMounted(AnyType rider);
}
