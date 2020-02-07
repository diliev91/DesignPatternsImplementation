package com.exercise.patterns.behavioural.strategy;

import com.exercise.patterns.IPatternExample;
/*
    Strategy Impl:
    https://sourcemaking.com/design_patterns/strategy
    Define a family of algorithms, encapsulate each one, and make them interchangeable.
    Strategy lets the algorithm vary independently from the clients that use it.
    Capture the abstraction in an interface, bury implementation details in derived classes.
 */
public class StrategyExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("In Strategy pattern implementation.");
        //Client1
        Client clientOne = new Client(new StrategyOne(), "Client 1");
        clientOne.executeStrategy();
        //Client2
        Client clientTwo = new Client(new StrategyTwo(), "Client 2");
        clientTwo.executeStrategy();
        IStrategy[] strategies = {new StrategyOne(), new StrategyTwo()};
        for(IStrategy strat: strategies){
            strat.doWork();
        }
        System.out.println("End of Strategy execution.");
    }
}
