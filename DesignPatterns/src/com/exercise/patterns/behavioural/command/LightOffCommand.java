package com.exercise.patterns.behavioural.command;

public class LightOffCommand implements  ICommand {
    Light light;
    public LightOffCommand(Light light) {
        this.light =light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }

    @Override
    public void unexecute() {
        this.light.turnOn();
    }

}
