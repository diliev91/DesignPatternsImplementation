package com.exercise.patterns.behavioural.templatemethod;

import com.exercise.patterns.IPatternExample;
/*
Template Method pattern
https://sourcemaking.com/design_patterns/template_method
Define the skeleton of an algorithm in an operation, deferring some steps to client subclasses.
Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
Base class declares algorithm 'placeholders', and derived classes implement the placeholders.

 */

public class TemplateMethodPatternExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Template Method example:");
        User user = new User();
        user.save();
    }
}
