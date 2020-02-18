package com.exercise.patterns.creational.abstractfactory;

import com.exercise.patterns.IPatternExample;

public class AbstractFactoryExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Example of Abstract factor:");
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        IAbstractProductA productA = concreteFactory1.createProductA();
        IAbstractProductB productB = concreteFactory1.createProductB();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        productA = concreteFactory2.createProductA();
        productB = concreteFactory2.createProductB();
        System.out.println("End of Abstract Factory Example.");

    }
}
