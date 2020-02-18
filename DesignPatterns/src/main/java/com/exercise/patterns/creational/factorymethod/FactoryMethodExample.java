package com.exercise.patterns.creational.factorymethod;

import com.exercise.patterns.IPatternExample;

public class FactoryMethodExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Factory Method Example:");
        MazeGame ordinaryGame = new OrdinaryMazeGame();
        MazeGame magicGame = new MagicMazeGame();
        System.out.println("End of Factory Mehtod Example.");
    }
}
