package com.exercise.patterns.behavioural.observer;

import java.util.HashSet;

public class TemperatureSensor implements IObservable{
    private HashSet<IObserver> observers = new HashSet<>();
    private int temperature;
    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public int getChange() {
        return temperature;
    }


    public void notifyObservers() {
        for(IObserver observer : observers) {
            observer.alert();
        }
    }

    public void setTemperature(int temperature) {
        System.out.println(String.format("Setting temperature to: %s", temperature));
        this.temperature = temperature;
        notifyObservers();
    }
}
