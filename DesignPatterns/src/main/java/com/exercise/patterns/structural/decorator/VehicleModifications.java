package com.exercise.patterns.structural.decorator;

public class VehicleModifications implements IVehicle {
    private IVehicle vehicle;

    public VehicleModifications(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void drive() {
        vehicle.drive();
    }
}
