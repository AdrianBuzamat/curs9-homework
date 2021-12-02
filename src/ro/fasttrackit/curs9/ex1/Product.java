package ro.fasttrackit.curs9.ex1;

public class Product {
    private double price;
    private String name;
    private String description;
    private int quantity;


    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "name= '" + name + '\'' + ", "+
                "price= " + price +
                ", description= '" + description + '\'' +
                ", quantity= " + quantity +
                ", ";
    }
}
