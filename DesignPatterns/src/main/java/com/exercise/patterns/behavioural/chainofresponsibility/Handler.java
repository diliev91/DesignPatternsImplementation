package com.exercise.patterns.behavioural.chainofresponsibility;

import java.util.Random;

public class Handler {
    private final static Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;
    private Handler nextInChain;
    private Handler nextHandler() {
        return nextInChain;
    }
    public void add(Handler handler) {
        if(this.nextInChain == null) {
            this.nextInChain = handler;
        } else {
            this.nextInChain.add(handler);
        }
    }
    public void wrapArround(Handler root) {
        if(this.nextInChain == null) {
            this.nextInChain = root;
        } else {
            this.nextInChain.wrapArround(root);
        }
    }
    public void handle(int num) {
        if (RANDOM.nextInt(4) != 0) {
            System.out.println("   " + id + "-busy  ");
            nextInChain.handle(num);
        } else {
            System.out.println(id + "-handled-" + num);
        }
    }
}
