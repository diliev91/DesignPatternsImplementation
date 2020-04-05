package com.exercise.patterns.behavioural.visitor;

public class Tabaco implements Item, Visitable{
    double price;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public Tabaco(double price) {
        this.price = price;
    }
}
