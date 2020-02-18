package com.exercise.patterns.behavioural.command;

import com.exercise.patterns.IPatternExample;

public class CommandPatternExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Command example:");
        Light light = new Light();
        LightOnCommand lOnCmd = new LightOnCommand(light);
        LightOffCommand lOffCmd = new LightOffCommand(light);
        Invoker invoker = new Invoker(lOnCmd, lOffCmd);
        invoker.clickOn();
        invoker.clickOff();
    }
}
