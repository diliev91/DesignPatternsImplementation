package com.exercise.patterns.behavioural.state;

public class StateContext {
    private IState state;

    public StateContext() {
        state = new LowerCaseState();
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void writeName(String name) {
        state.writeName(this, name);
    }
}
