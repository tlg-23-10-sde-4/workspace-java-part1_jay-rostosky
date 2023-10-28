package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

class ShapeClient {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        // fill the array with Shapes
        shapes[0] = new Circle(2.5);            // 19.63
        shapes[1] = new Rectangle(2, 3);        // 6.0
        shapes[2] = new Triangle(1, 1, 90);     // 0.5
        shapes[3] = new Triangle(1, 2, 45);     // 0.707

        double totalArea = 0.0;

        for (Shape shape : shapes) {
            double area = shape.area();
            totalArea += area;
            System.out.printf("The area of the %s is %s\n", shape.getClass().getSimpleName(), area);
        }

        System.out.printf("\nThe total area is %s\n\n", totalArea);

        System.out.println(((Triangle) shapes[3]).diagram());
    }
}