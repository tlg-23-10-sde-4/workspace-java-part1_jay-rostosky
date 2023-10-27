package edu.geometry;

public class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return getLength() * getWidth();
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}