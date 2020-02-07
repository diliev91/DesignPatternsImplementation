package com.exercise.patterns.structural.bridge;

public abstract class RemoteButton {
    private EntartaimentDevice device;

    public RemoteButton(EntartaimentDevice device) {
        this.device = device;
    }

    public void buttonFivePressed(){
        device.buttonFivePressed();
    }

    public void buttonSixPressed(){
        device.buttonSixPressed();
    }

    public void deviceFeedback(){
        device.deviceFeedback();
    }

    public abstract void buttonNinePressed();
}
