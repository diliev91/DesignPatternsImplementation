package com.exercise.patterns.behavioural.observer;

import com.exercise.patterns.IPatternExample;

/*
    source: https://sourcemaking.com/design_patterns/observer
    Intent
        Define a one-to-many dependency between objects so that when one object changes state,
        all its dependents are notified and updated automatically.
        Encapsulate the core (or common or engine) components in a Subject abstraction,
        and the variable (or optional or user interface) components in an Observer hierarchy.
        The "View" part of Model-View-Controller.
    Problem
        A large monolithic design does not scale well as new graphing or monitoring requirements are levied.
 */
public class ObserverExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("From Observer pattern implementation.");
        TemperatureSensor observable = new TemperatureSensor();

        TemperatureDisplay display = new TemperatureDisplay();
        display.setObservable(observable);
        observable.addObserver(display);

        WeatherWebSite weatherWebSite = new WeatherWebSite();
        weatherWebSite.setObservable(observable);
        observable.addObserver(weatherWebSite);

        observable.setTemperature(21);

        System.out.println("End of Observer pattern implementation.");
    }
}
