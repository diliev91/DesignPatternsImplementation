package com.exercise;

import com.exercise.patterns.IPatternExample;

public class Main {
//Creational Design Patterns:☑☐
    //☑Abstract Factory
    //☑Builder
    //☑Factory Method
    //☐Object Pool
    //☑Prototype
    //☑Singleton
//Structural Patterns:
    //☑Adapter
    //☑Bridge
    //☑Composite
    //☑Facade
    //☐Flyweight
    //☐Private Class Data
    //☑Proxy
    //☑Decorator
    //☑Iterator
//Behavioural Design Patterns:
    //☐Chain of Responsibility
    //☑Command
    //☐Interpreter
    //☐Mediator
    //☐Memento
    //☑Null Object Pattern
    //☑Observer
    //☑State
    //☑Strategy
    //☑Template Method
    //☐Visitor
    //☐Model-View-Controller
    public static void main(String[] args) {
        int i=0;
        for (IPatternExample impl: Implementations.get()) {
            System.out.println(++i+".");
            impl.run();
        }
    }
}
