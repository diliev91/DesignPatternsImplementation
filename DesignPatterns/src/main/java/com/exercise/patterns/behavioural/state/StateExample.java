package com.exercise.patterns.behavioural.state;

import com.exercise.patterns.IPatternExample;

public class StateExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("State Example Begin.");
        StateContext context = new StateContext();

        context.writeName("Monday");
        context.writeName("Tuesday");
        context.writeName("Wednesday");
        context.writeName("Thursday");
        context.writeName("Friday");
        context.writeName("Saturday");
        context.writeName("Sunday");
        System.out.println("State Example End.");
    }
}
