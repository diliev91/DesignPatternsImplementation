package com.exercise.patterns.behavioural.strategy;

public class Client {
    private IStrategy strategy;
    private String clientName;
    public Client(IStrategy strategy, String clientName) {
        this.strategy = strategy;
        this.clientName = clientName;
    }

    public void executeStrategy() {
        System.out.println(String.format("In client %s executing strategy.", clientName));
        strategy.doWork();
    }
}
