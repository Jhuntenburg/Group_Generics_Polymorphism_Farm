package Persons;

import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public interface Rider<VehicleType extends Rideable> {

    void mount(Rideable rideable);

    void dismount(Rideable rideable);

}
