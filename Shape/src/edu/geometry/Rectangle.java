package edu.geometry;

public class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override  // interface Shape
    public double area() {
        return length() * width();
    }

    public double length() {
        return length;
    }

    public double width() {
        return width;
    }
}