package com.exercise.patterns.structural.adapter;

import com.exercise.patterns.IPatternExample;

/*
    https://sourcemaking.com/design_patterns/adapter
 */
public class AdapterPatternExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Adapter example:");
        IVoltageAdapter[] chargers = {
                new JapanToEUadapter(new JapanCharger()),
                new USAtoEUAdapter(new USAcharger())
        };
        for(IVoltageAdapter charger : chargers) {
            charger.charge();
        }

    }
}
