package com.exercise.patterns.behavioural.command;


public class LightOnCommand implements ICommand {
    Light light;
    public LightOnCommand(Light light) {
        this.light =light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }

    @Override
    public void unexecute() {
        this.light.turnOff();
    }
}
