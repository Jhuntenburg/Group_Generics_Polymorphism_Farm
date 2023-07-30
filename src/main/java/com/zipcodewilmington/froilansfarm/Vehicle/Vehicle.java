package com.zipcodewilmington.froilansfarm.Vehicle;

import Persons.Person;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

public abstract class Vehicle <AnyType extends Person>implements VehicleInterface, NoiseMaker {
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
