package com.exercise.patterns.creational.builder;

public class CarBuilder {
    Car car;

    public CarBuilder(Car car) {
        this.car = car;
    }

    public static CarBuilder builder() {
        return new CarBuilder(new Car());
    }
    public CarBuilder height(int height) {
        this.car.setHeight(height);
        return this;
    }
    public CarBuilder weight(int weight) {
        this.car.setWeight(weight);
        return this;
    }

    public CarBuilder colour(String colour) {
        this.car.setColour(colour);
        return this;
    }

    public CarBuilder make(String make) {
        this.car.setMake(make);
        return this;
    }

    public Car build(){
        return car;
    }
}
