package com.exercise.patterns.creational.abstractfactory;

public class ConcreteFactory1 implements IAbstractFactory {
    @Override
    public IAbstractProductA createProductA() {
        System.out.println("Creating product A1");
        return new ProductA1();
    }

    @Override
    public IAbstractProductB createProductB() {
        System.out.println("Creating product B1");
        return new ProductB1();
    }
}
