package com.exercise.patterns.structural.decorator;



public class StockCar implements IVehicle{
    @Override
    public void drive() {

        System.out.println("This is stock Car that drives with 140 km/h top speed.");
    }
}

