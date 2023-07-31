package com.zipcodewilmington.froilansfarm.Animal;

public class Chicken {
    public boolean isHasBeenFertilized() {
        return false;
    }

    public void setHasBeenFertilized(boolean b) {
    }

    public String makeNoise() {
        return "Cluck";
    }

    public <EdibleEgg> EdibleEgg yield() {
        return null;
    }
}
