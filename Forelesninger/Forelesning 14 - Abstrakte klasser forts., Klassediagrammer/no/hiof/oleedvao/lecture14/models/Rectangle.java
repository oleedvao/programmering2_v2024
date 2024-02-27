package no.hiof.oleedvao.lecture14.models;

public class Rectangle extends Figure {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);

        this.length = length;
        this.width = width;
    }

    @Override
    public double circumference() {
        //2*lengde + 2*vidde
        return 2*length + 2*width;
    }

    @Override
    public double area() {
        return length*width;
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
