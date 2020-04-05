package com.exercise.patterns.behavioural.visitor;

public class Liquor implements Item, Visitable{
    Double price;
    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public Liquor(double price) {
        this.price = price;
    }
}
