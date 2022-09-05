package ua.hillelit.homeworks.service;

import ua.hillelit.homeworks.api.Calculateable;
import ua.hillelit.homeworks.model.shape.Circle;
import ua.hillelit.homeworks.model.shape.Rectangle;
import ua.hillelit.homeworks.model.shape.Triangle;

public class ShapeCreator {

    public static void main(String[] args) {

        Circle circle = new Circle(2);
        Rectangle rect = new Rectangle(4, 8);
        Triangle triangle = new Triangle(14, 7);

        Calculateable[] shapes = {circle, rect, triangle};

        sumOfSquares(shapes);
    }

    public static void sumOfSquares(Calculateable[] shapes) {
        double sum = 0;
        for (Calculateable s : shapes) {
            sum += s.calcSquare();
        }
        System.out.println(sum);
    }

}
