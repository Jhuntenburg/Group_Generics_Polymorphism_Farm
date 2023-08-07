package com.zipcodewilmington.froilansfarm.StorageUnits;

import java.util.ArrayList;

public abstract class StorageUnit<AnyType> extends ArrayList<AnyType>{
    private ArrayList<AnyType> storageList;

    public StorageUnit() {
        this.storageList = new ArrayList<AnyType>();
    }

    public StorageUnit(ArrayList<AnyType> storageList) {
        this.storageList = storageList;
    }
}
