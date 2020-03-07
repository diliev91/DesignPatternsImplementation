package com.exercise.patterns.structural.iterator;

import java.util.NoSuchElementException;

public class Iteratorr {
    int index;
    int end;
    public Iteratorr(int start, int end) {
        if(start > end) {
            throw new IllegalArgumentException("Start > End!");
        }
        index = start;
        this.end = end;
    }

    public boolean hasNext(){
        return this.index < this.end;
    }
    public Integer next(){
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        return index++;
    }
}
