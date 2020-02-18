package com.exercise.patterns.structural.adapter;

public class USAtoEUAdapter implements IVoltageAdapter {
    USAcharger charger;

    public USAtoEUAdapter(USAcharger charger) {
        this.charger = charger;
    }

    @Override
    public void charge() {
        System.out.println("Using EU adapter to charge with USA adapter.");
        charger.charge();
    }
}
