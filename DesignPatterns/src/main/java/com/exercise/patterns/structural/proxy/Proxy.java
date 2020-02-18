package com.exercise.patterns.structural.proxy;

public class Proxy implements ISubject {
    private RealSubject subject;

    public Proxy(RealSubject subject) {
        this.subject = subject;
    }
        @Override
    public void doIt() {
        System.out.println("In Proxy doIt().");
        subject.doIt();
    }
}
