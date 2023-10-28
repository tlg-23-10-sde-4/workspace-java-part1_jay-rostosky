package edu.geometry;

import static java.lang.Math.*;

/*
 *         B
 *         /\
 *      a /  \ c
 *       /    \
 *      /      \
 *    C -------- A
 *         b
 */
public class Triangle implements Shape {
    private final double a;
    private final double b;
    private final double C;  // in degrees

    public Triangle(double side1, double side2, double angleBetween) {
        this.a = side1;
        this.b = side2;
        this.C = angleBetween;
    }

    @Override  // interface Shape
    public double area() {
        return 0.5 * a * b * sin(toRadians(C));
    }

    public double sideA() {
        return a;
    }

    public double sideB() {
        return b;
    }

    public double angleC() {
        return C;
    }

    public String diagram() {
        return "         B\n"        +
               "         /\\\n"      +
               "      a /  \\ c\n"   +
               "       /    \\\n"    +
               "      /      \\\n"   +
               "    C -------- A\n"  +
               "         b";
    }
}