package com.exercise.patterns.structural.iterator;

import com.exercise.patterns.IPatternExample;

public class RangeIteratorExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Begin of iterator example.");
        Iteratorr it = new Iteratorr(0, 10);
        while(it.hasNext()) {
                System.out.println(it.next());
            }
        System.out.println("End of iterator example.");
    }
}
