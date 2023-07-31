package com.zipcodewilmington.froilansfarm.Vehicle;


import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Rideable;

public abstract class Vehicle <AnyType extends Person, Rider>implements VehicleInterface, NoiseMaker, Rideable {
    AnyType operator;
    boolean engineIsOn = false;

    public Vehicle() {}
    public Vehicle(AnyType operator) {
        this.operator = operator;
    }

    public AnyType getOperator() {
        return operator;
    }

    public void setOperator(AnyType operator) {
        this.operator = operator;
    }

    public boolean getEngineIsOn() {
        return engineIsOn;
    }
    public boolean getEngineStatus() {return getEngineIsOn();}

    public void turnOnEngine() {
        this.engineIsOn = true;
    }

    public void turnOffEngine() {
        this.engineIsOn = false;
    }

}
