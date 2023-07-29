package com.zipcodewilmington.froilansfarm.Vehicle;

public abstract class Vehicle {
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

    public boolean isEngineIsOn() {
        return engineIsOn;
    }

    public void turnOnEngine() {
        this.engineIsOn = true;
    }

    public void turnOffEngine() {
        this.engineIsOn = false;
    }

}