package com.exercise.patterns.structural.privateclassdata;

import java.awt.*;

public class CircleSpecs {
    class Circle {
        private CircleSpecs circleSpecs;

        public Circle(double radius, Point center) {
            this.circleSpecs = new CircleSpecs(radius, center);
        }

        public double circumference() {
            return this.circleSpecs.radius * Math.PI;
        }

        public double diameter(){
            return this.circleSpecs.radius * 2;
        }
    }
    private double radius;
    private Point center;

    public CircleSpecs(double radis, Point center){
        this.radius = radis;
        this.center = center;
    }

    public double radius() {
        return radius;
    }

    public Point center() {
        return center;
    }

}
