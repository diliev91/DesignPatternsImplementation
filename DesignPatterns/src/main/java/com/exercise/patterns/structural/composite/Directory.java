package com.exercise.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Directory implements  Entity {
    private String name;
    List<Entity> entities = new ArrayList<Entity>();
    public Directory(String name) {
        this.name = name;
    }
    public void addEntity(Entity entity) {
        entities.add(entity);
    }
    @Override
    public void traverse(int level) {
        printName(level);
        for(int i =0 ; i< entities.size() ;i++) {
            entities.get(i).traverse(level+1);
        }
    }

    @Override
    public void printName(int level) {
        System.out.println(String.join("", Collections.nCopies(level, "\t"))+name);
    }
}
