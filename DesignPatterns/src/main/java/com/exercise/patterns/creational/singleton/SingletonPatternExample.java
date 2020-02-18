package com.exercise.patterns.creational.singleton;

import com.exercise.patterns.IPatternExample;

public class SingletonPatternExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Singleton example:");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        boolean equals = instance.equals(instance2);
        System.out.println(String.format("Instance 1 has the same reference as instance 2: %b", equals));
        System.out.println("End of singleton example.");
    }
}
