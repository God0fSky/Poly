package ua.hillelit.homeworks.model.shape;

import ua.hillelit.homeworks.api.Calculateable;

public class Rectangle implements Calculateable {

    private double length;
    private double width;


    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcSquare() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
