package com.exercise.patterns.behavioural.visitor;

public class Nessesity implements Item , Visitable{
    double price;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public Nessesity(double price) {
        this.price = price;
    }
}
