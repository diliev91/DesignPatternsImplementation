package com.exercise.patterns.behavioural.memento;

import com.exercise.patterns.IPatternExample;

public class MementoExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Memento Example!");
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento( originator.save() );
        originator.setState("State3");
        caretaker.addMemento( originator.save() );
        originator.setState("State4");
        originator.restore(caretaker.getMemento());
        System.out.println("End Memento Example.");
    }
}
