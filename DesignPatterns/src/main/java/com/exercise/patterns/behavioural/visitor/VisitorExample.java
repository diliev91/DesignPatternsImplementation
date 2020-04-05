package com.exercise.patterns.behavioural.visitor;

import com.exercise.patterns.IPatternExample;

public class VisitorExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Visitor Example.");
        TaxVisitor visitor = new TaxVisitor();

        Nessesity breath = new Nessesity(1.2);
        Tabaco victory = new Tabaco(5.4);
        Liquor jb = new Liquor(24);

        System.out.println(breath.accept(visitor));
        System.out.println(victory.accept(visitor));
        System.out.println(jb.accept(visitor));
        System.out.println("End of visitor Example");
    }
}
