package ua.hillelit.homeworks.model.shape;

import ua.hillelit.homeworks.api.Calculateable;

public class Circle implements Calculateable {

    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return Math.PI * Math.pow(radius, 2);
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }
}
