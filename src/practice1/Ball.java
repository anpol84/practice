package practice1;

public class Ball {
    private int size;
    private String color;
    public Ball(String color, int size){
        this.color = color;
        this.size = size;
    }
    public Ball(String color){
        this.color = color;
        this.size = 1;
    }
    public Ball(){
        this.color = "white";
        this.size = 1;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getSize(){
        return this.size;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        return "Size " + this.size + ", color " + this.color;
    }
}
