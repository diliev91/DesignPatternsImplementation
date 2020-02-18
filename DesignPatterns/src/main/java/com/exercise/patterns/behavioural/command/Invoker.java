package com.exercise.patterns.behavioural.command;

public class Invoker {
    ICommand turnOn;
    ICommand turnOff;

    public Invoker(ICommand turnOn, ICommand turnOff) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
    }
    public void clickOn() {
        turnOn.execute();
    }
    public void clickOff() {
        turnOff.execute();
    }
}
