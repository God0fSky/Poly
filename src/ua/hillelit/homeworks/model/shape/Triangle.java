package ua.hillelit.homeworks.model.shape;

import ua.hillelit.homeworks.api.Calculateable;

public class Triangle implements Calculateable {

    private double side;
    private double height;

    public Triangle() {
        side = 0;
        height = 0;
    }

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calcSquare() {
        return 0.5 * side * height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
