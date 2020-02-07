package com.exercise.patterns.behavioural.observer;

public class TemperatureDisplay implements IObserver {
    IObservable observable;

    public void setObservable(IObservable observable) {
        this.observable = observable;
    }

    @Override
    public void alert() {
        int change = this.observable.getChange();
        System.out.println(String.format("From TemperatureDisplay new Temperature is: %s",change));
    }
}
