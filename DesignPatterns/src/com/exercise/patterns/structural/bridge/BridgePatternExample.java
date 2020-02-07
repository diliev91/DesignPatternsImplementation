package com.exercise.patterns.structural.bridge;

import com.exercise.patterns.IPatternExample;
/*
    Bridge:
    https://sourcemaking.com/design_patterns/bridge
    -Decouple an abstraction from its implementation so that the two can vary independently.
    -Publish interface in an inheritance hierarchy, and bury implementation in its own inheritance hierarchy.
    -Beyond encapsulation, to insulation

 */
public class BridgePatternExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Bridge example:");

        RemoteButton tv = new TVRemoteMute(new TvDevice(1,200));
        RemoteButton tv2 = new TVRemotePause(new TvDevice(1,200));
        System.out.println("Test tv Mute:");

        tv.buttonFivePressed();
        tv.buttonSixPressed();
        tv.buttonNinePressed();

        System.out.println("Test TV with Pause");

        tv2.buttonFivePressed();
        tv2.buttonSixPressed();
        tv2.buttonNinePressed();
        tv2.deviceFeedback();
    }
}
