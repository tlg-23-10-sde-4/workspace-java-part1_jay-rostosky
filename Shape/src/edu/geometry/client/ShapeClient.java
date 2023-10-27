package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;

class ShapeClient {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(2.5);  // 19.63
        shapes[1] = new Circle(3.2);  // 32.16

        shapes[2] = new Rectangle(2.0, 3.0);  // 6.0
        shapes[3] = new Rectangle(2.0, 4.0);  // 8.0

        for (Shape shape : shapes) {
            // desire: The area of the Circle is 4.56
            System.out.printf("The area of the %s is %s\n", shape.getClass().getSimpleName(), shape.area());
        }
    }
}