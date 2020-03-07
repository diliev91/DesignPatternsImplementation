package com.exercise.patterns.creational.threadpool;

import com.exercise.patterns.IPatternExample;

public class ObjectPoolExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Begin Object Pool Pattern Example");
        PooledObject object = PooledObjectPool.getObject();
        object.temp1= "diliev";
        PooledObjectPool.releaseObject(object);
        System.out.println("End Object Pool Pattern Example");
    }
}
