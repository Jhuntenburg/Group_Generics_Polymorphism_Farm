package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.NoiseMaker;

public abstract class Vehicle implements VehicleInterface, NoiseMaker {
    Person operator;
    boolean engineIsOn = false;

    public Vehicle() {}
    public Vehicle(Person operator) {
        this.operator = operator;
    }

    public Person getOperator() {
        return operator;
    }

    public void setOperator(Person operator) {
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
