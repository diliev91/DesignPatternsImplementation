package com.exercise.patterns.structural.decorator;

import com.exercise.patterns.IPatternExample;
/*
* Decorator Example:
* https://sourcemaking.com/design_patterns/decorator
*
* Intent
*   Attach additional responsibilities to an object dynamically.
*   Decorators provide a flexible alternative to subclassing for extending functionality.
*   Client-specified embellishment of a core object by recursively wrapping it.
*   Wrapping a gift, putting it in a box, and wrapping the box.
* Problem
*   You want to add behavior or state to individual objects at run-time.
*   Inheritance is not feasible because it is static and applies to an entire class.


* */
public class DecoratorExample implements IPatternExample {
    @Override
    public void run() {
        System.out.println("Decorator example:");
        IVehicle modifiedVehicle = new Turbo(new TrackTyres(new SportBrakes(new Spoiler(new StockCar()))));
        modifiedVehicle.drive();
        System.out.println("End of decorator example.");
    }
}
