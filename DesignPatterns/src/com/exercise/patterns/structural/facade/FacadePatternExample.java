package com.exercise.patterns.structural.facade;

import com.exercise.patterns.IPatternExample;

/*
Facade example:
https://sourcemaking.com/design_patterns/facade
 */
public class FacadePatternExample implements IPatternExample {

    @Override
    public void run() {
        System.out.println("Facade example:");
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
