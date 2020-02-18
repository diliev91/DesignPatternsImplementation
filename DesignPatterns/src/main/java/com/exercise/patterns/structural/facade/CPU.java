package com.exercise.patterns.structural.facade;

public class CPU {

    public void freeze() { System.out.println("Freezing CPU");  }
    public void jump(long position) { System.out.println("jumping CPU"); }
    public void execute() { System.out.println("executing CPU CMD"); }

}
