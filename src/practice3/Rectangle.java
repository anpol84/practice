package practice3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle( double width, double length,  String color, boolean filled ) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.color = "blue";
        this.filled = false;
    }

    public Rectangle() {
        this.width = 1;
        this.length = 2;
        this.color = "blue";
        this.filled = false;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+", length: "+this.length + ", color: " + this.color;
    }

    @Override
    double getArea() {
        return this.length*this.width;
    }

    @Override
    double getPerimeter() {
        return 2*(this.width+this.length);
    }
}
