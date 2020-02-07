package com.exercise.patterns.creational.factorymethod;

public class OrdinaryRoom extends Room {
    @Override
    void connect(Room room) {
        System.out.println("Connecting OrdinaryRoom");
    }
}
