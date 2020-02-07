package com.exercise.patterns.behavioural.observer;

public interface IObservable {
    void addObserver(IObserver observer);
    int getChange();

}
