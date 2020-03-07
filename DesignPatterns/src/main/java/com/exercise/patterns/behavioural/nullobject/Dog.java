package com.exercise.patterns.behavioural.nullobject;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("WOOF!");
    }
}
