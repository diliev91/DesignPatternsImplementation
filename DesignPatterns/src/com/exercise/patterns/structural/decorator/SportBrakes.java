package com.exercise.patterns.structural.decorator;

public class SportBrakes extends VehicleModifications{
    public SportBrakes(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Sport brakes Improve stopping by 50%.");
    }
}
