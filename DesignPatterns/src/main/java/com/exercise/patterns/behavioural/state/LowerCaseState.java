package com.exercise.patterns.behavioural.state;

public class LowerCaseState implements IState {
    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toLowerCase());
        context.setState(new MultipleUpperCaseState());
    }
}
