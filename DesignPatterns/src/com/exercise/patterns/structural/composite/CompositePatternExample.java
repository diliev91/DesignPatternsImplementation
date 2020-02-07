package com.exercise.patterns.structural.composite;

import com.exercise.patterns.IPatternExample;

/*
    Composite Design Pattern
    https://sourcemaking.com/design_patterns/composite
    Compose objects into tree structures to represent whole-part hierarchies.
     Composite lets clients treat individual objects and compositions of objects uniformly.
    Recursive composition
    "Directories contain entries, each of which could be a directory."
    1-to-many "has a" up the "is a" hierarchy
 */
public class CompositePatternExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Composite Pattern Example:");
        Entity fileOne = new FileEntity("One");
        Entity fileTwo = new FileEntity("Two");
        Entity fileThree = new FileEntity("Three");
        Directory directory = new Directory("Directory");
        directory.addEntity(fileOne);
        directory.addEntity(fileTwo);
        directory.addEntity(fileThree);
        Directory dir2 = new Directory("Directory 2");
        dir2.addEntity(new FileEntity("Four"));
        dir2.addEntity(new FileEntity("Five"));
        dir2.addEntity(new FileEntity("Six"));
        directory.addEntity(dir2);
        directory.traverse(0);
    }
}
