package com.exercise.patterns.behavioural.nullobject;

import com.exercise.patterns.IPatternExample;

public class NullObjectExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Null Object Example.");
        NullAnimal nullAnimal = new NullAnimal();
        Dog dog =  new Dog();

        System.out.print("Dog makes noise: ");
        dog.makeSound();

        System.out.println("Null Animal makes noise: ");
        nullAnimal.makeSound();

        System.out.println("End of Null Object Example.");
    }
}
