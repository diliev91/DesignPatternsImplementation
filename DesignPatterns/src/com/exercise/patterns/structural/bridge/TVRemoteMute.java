package com.exercise.patterns.structural.bridge;

public class TVRemoteMute extends RemoteButton {
    public TVRemoteMute(EntartaimentDevice device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Muted");
    }

}
