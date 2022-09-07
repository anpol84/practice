package practice3;

public class Circle extends Shape{
    protected double radius;

    public Circle( double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.filled = false;
        this.color = "blue";
    }

    public Circle() {
        this.radius = 1;
        this.filled = false;
        this.color = "blue";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }

    @Override
    double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
}
