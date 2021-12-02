package ro.fasttrackit.curs9.ex1;

public class Cosmetics extends Product{
    private String color;
    private double weight;


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return  "Category: Cosmetics: " +
                super.toString() +
                "color= '" + color + '\'' +
                ", weight= " + weight +
                ".";
    }
}
