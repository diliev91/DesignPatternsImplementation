package com.exercise.patterns.behavioural.mediator;

import com.exercise.patterns.IPatternExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    In software engineering, the mediator pattern defines an object that encapsulates how a set of objects interact.
    This pattern is considered to be a behavioral pattern due to the way it can alter the program's running behavior.
    source: https://sourcemaking.com/design_patterns/mediator

    Problem
        We want to design reusable components, but dependencies between the potentially reusable pieces demonstrates
        the "spaghetti code" phenomenon (trying to scoop a single serving results in an "all or nothing clump").
    Intent
        Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping
        objects from referring to each other explicitly, and it lets you vary their interaction independently.
        Design an intermediary to decouple many peers.
        Promote the many-to-many relationships between interacting peers to "full object status".

 */
public class MediatorExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Mediator Example.");
        List<Thread> producerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Mediator mb = new Mediator();
        producerList.add(new Thread(new Producer(mb)));
        //TODO fix threading here!
    //    producerList.add(new Thread(new Producer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        for (Thread p : producerList) {
            p.start();
        }

        System.out.println("End of Mediator Example");
    }
}

