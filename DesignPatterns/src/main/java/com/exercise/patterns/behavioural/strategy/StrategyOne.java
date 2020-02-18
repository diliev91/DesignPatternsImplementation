package com.exercise.patterns.behavioural.strategy;

public class StrategyOne implements IStrategy {
    @Override
    public void doWork() {
        System.out.println("In Strategy One!");
    }
}
