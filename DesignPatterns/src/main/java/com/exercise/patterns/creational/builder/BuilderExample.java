package com.exercise.patterns.creational.builder;

import com.exercise.patterns.IPatternExample;

public class BuilderExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Begin of Builder Example.");
        Car car = CarBuilder.builder().colour("Black").height(160).weight(1500).make("Opel").build();
        System.out.println(String.format("The car is: %s", car.toString()));
        System.out.println("End of Builder Example.");

    }
}
