package com.exercise.patterns.structural.decorator;

public class Spoiler extends VehicleModifications {
    public Spoiler(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("The spoiler improves downforce by 20%.");
    }
}
