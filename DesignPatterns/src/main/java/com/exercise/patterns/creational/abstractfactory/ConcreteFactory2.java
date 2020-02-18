package com.exercise.patterns.creational.abstractfactory;

public class ConcreteFactory2 implements IAbstractFactory {
    @Override
    public IAbstractProductA createProductA() {
        System.out.println("In ConcreteFactory2 creating object of ProductA");
        return new ProductA2();
    }

    @Override
    public IAbstractProductB createProductB() {
        System.out.println("In ConcreteFactory2 creating object of ProductB");
        return new ProductB2();
    }
}
