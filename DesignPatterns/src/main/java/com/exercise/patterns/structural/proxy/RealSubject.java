package com.exercise.patterns.structural.proxy;

public class RealSubject implements ISubject {
    @Override
    public void doIt() {
        System.out.println("In RealSubject doIt().");
    }
}
