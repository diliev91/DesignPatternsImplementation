package com.exercise.patterns.structural.bridge;

public class TvDevice extends EntartaimentDevice {
    public TvDevice(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maxSetting = newMaxSetting ;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Channel down.");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Channel up.");
        deviceState++;
    }
}
