package com.exercise.patterns.behavioural.chainofresponsibility;

import com.exercise.patterns.IPatternExample;

/*
    Source:
    https://sourcemaking.com/design_patterns/chain_of_responsibility
 */
public class ChainOfResponsibilityExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Chain of Responsibility example.");
        Handler rootChain = new Handler();
        rootChain.add(new Handler());
        rootChain.add(new Handler());
        rootChain.add(new Handler());
        rootChain.wrapArround(rootChain);
        for (int i = 1; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            rootChain.handle(i);
            System.out.println();
        }
        System.out.println("End of Chain of Responsibility example.");
    }
}
