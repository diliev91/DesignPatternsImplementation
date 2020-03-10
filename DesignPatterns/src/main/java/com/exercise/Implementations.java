package com.exercise;

import com.exercise.patterns.IPatternExample;
import com.exercise.patterns.behavioural.nullobject.NullObjectExample;
import com.exercise.patterns.behavioural.state.StateExample;
import com.exercise.patterns.behavioural.templatemethod.TemplateMethodPatternExample;
import com.exercise.patterns.creational.abstractfactory.AbstractFactoryExample;
import com.exercise.patterns.creational.builder.BuilderExample;
import com.exercise.patterns.creational.prototype.PrototypeExample;
import com.exercise.patterns.creational.threadpool.ObjectPoolExample;
import com.exercise.patterns.structural.adapter.AdapterPatternExample;
import com.exercise.patterns.structural.bridge.BridgePatternExample;
import com.exercise.patterns.behavioural.command.CommandPatternExample;
import com.exercise.patterns.structural.composite.CompositePatternExample;
import com.exercise.patterns.structural.decorator.DecoratorExample;
import com.exercise.patterns.structural.facade.FacadePatternExample;
import com.exercise.patterns.creational.factorymethod.FactoryMethodExample;
import com.exercise.patterns.behavioural.observer.ObserverExample;
import com.exercise.patterns.structural.flyweight.FlyweightExample;
import com.exercise.patterns.structural.iterator.RangeIteratorExample;
import com.exercise.patterns.structural.privateclassdata.PrivateClassDataExample;
import com.exercise.patterns.structural.proxy.ProxyPatternExample;
import com.exercise.patterns.creational.singleton.SingletonPatternExample;
import com.exercise.patterns.behavioural.strategy.StrategyExample;

public class Implementations {
    public static IPatternExample[] get() {
        return new IPatternExample[]{
                new StrategyExample(),
                new ObserverExample(),
                new DecoratorExample(),
                new FactoryMethodExample(),
                new AbstractFactoryExample(),
                new SingletonPatternExample(),
                new CommandPatternExample(),
                new AdapterPatternExample(),
                new FacadePatternExample(),
                new ProxyPatternExample(),
                new BridgePatternExample(),
                new TemplateMethodPatternExample(),
                new CompositePatternExample(),
                new RangeIteratorExample(),
                new StateExample(),
                new NullObjectExample(),
                new BuilderExample(),
                new PrototypeExample(),
                new ObjectPoolExample(),
                new FlyweightExample(),
                new PrivateClassDataExample(),
        };
    }
}