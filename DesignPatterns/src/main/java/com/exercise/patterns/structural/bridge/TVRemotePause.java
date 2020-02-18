package com.exercise.patterns.structural.bridge;

public class TVRemotePause extends RemoteButton {
    public TVRemotePause(EntartaimentDevice device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Paused");
    }
}
