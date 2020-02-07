package com.exercise.patterns.structural.decorator;

public class TrackTyres extends VehicleModifications {
    public TrackTyres(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Track tyres improve grip by 40%");
    }
}
