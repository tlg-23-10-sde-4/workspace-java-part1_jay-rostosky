package edu.geometry;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override  // interface Shape
    public double area() {
        return Math.PI * radius * radius;
    }

    public double radius() {
        return radius;
    }
}