package ro.fasttrackit.curs9.ex1;

public class Electronics extends Product {
    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Category: Electronics: " +
                super.toString() +
                "type='" + type + '\'' +
                ", dimension=" + length + "x" + width + "x" + height +
                ", weight=" + weight +
                '}';
    }
}
