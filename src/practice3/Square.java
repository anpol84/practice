package practice3;


public class Square extends Rectangle{
    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.length = side;
        this.width = side;
    }

    public Square(double side) {
        this.color = "blue";
        this.filled = false;
        this.length = side;
        this.width = side;
    }

    public Square() {
        this.color = "blue";
        this.filled = false;
        this.length = 1;
        this.width = 1;
    }

    public double getSide(){
        return this.length;
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: "+this.width+", color: " + this.color;
    }
}
