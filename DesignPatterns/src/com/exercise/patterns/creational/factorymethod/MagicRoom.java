package com.exercise.patterns.creational.factorymethod;

public class MagicRoom extends Room {
    @Override
    void connect(Room room) {
        System.out.println("Magic room connected.");
    }
}
