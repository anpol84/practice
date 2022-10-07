package practice12_15;

public class Shirt {
    private String model;
    private String name;
    private String color;
    private String size;

    public Shirt(String [] a) {
        this.model = a[0];
        this.name = a[1];
        this.color = a[2];
        this.size = a[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
