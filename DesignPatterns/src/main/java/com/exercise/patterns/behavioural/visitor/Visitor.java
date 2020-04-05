package com.exercise.patterns.behavioural.visitor;

interface Visitor {

    public double visit(Liquor liquor);
    public double visit(Tabaco liquor);
    public double visit(Nessesity liquor);
}
