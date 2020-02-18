package com.exercise.patterns.structural.adapter;

public class JapanToEUadapter  implements IVoltageAdapter{
    JapanCharger charger;
    public JapanToEUadapter(JapanCharger charger) {
        this.charger = charger;
    }

    @Override
    public void charge() {
        System.out.println("Using EU adapter to charge with Japan type adapter.");
        charger.charge();
    }
}
