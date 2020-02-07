package com.exercise.patterns.structural.composite;
import java.util.Collections;

public class FileEntity implements Entity {
    private String name;

    public FileEntity(String name) {
        this.name = name;
    }

    @Override
    public void traverse(int level) {
        printName(level);
    }

    @Override
    public void printName(int level) {
        System.out.println(String.join("", Collections.nCopies(level, "\t"))+name);
    }
}
