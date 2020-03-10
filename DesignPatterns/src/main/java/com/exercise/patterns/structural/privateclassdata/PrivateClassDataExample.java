package com.exercise.patterns.structural.privateclassdata;

import com.exercise.patterns.IPatternExample;

import java.awt.*;

/*
Sources:
1. https://medium.com/@dholnessii/structural-design-patterns-private-class-data-3b8e7f9881fc
2. https://sourcemaking.com/design_patterns/private_class_data
 */
public class PrivateClassDataExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Private Class Data Example.");
        new CircleSpecs(5, new Point(2,3));
    }
}
