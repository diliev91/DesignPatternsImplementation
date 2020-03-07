package com.exercise.patterns.creational.builder;

public class Car {
    private String colour;
    private int height;
    private int weight;
    private String make;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", make='" + make + '\'' +
                '}';
    }
}
