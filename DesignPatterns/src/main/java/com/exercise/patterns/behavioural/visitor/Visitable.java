package com.exercise.patterns.behavioural.visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
