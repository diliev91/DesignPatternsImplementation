package com.exercise.patterns.behavioural.visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##");
    @Override
    public double visit(Liquor liquor) {
        double price = liquor.getPrice() * 1.2 ;
        System.out.println("Price for liquor with tax:" + price);
        return price;
    }

    @Override
    public double visit(Tabaco liquor) {
        double price = liquor.getPrice() * 1.3 ;
        System.out.println("Price for tabaco with tax:" + price);
        return price;
    }

    @Override
    public double visit(Nessesity liquor) {
        double price = liquor.getPrice() * 1.1;
        System.out.println("Price for nessesity with tax:" + price);
        return price;
    }
}
