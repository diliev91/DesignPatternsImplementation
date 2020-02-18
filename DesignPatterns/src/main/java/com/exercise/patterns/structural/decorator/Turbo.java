package com.exercise.patterns.structural.decorator;

public class Turbo extends VehicleModifications {
    public Turbo(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("THis is turbo it gives 50% more hp.");
    }
}
