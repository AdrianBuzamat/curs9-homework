package ro.fasttrackit.curs9.ex1;

public class Product {
    private double price;
    private String name;
    private String description;
    private int quantity;

    public Product() {

    }
    public Product(double price) {
        this(price, "undefined", "undefined", 0);
    }

    public Product(double price, String name) {
        this(price,name, "undefined", 0);
    }

    public Product(double price, String name, String description) {
        this(price,name,description,0);
    }

    public Product(double price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
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
        return "name= '" + name + '\'' + ", " +
                "price= " + price +
                ", description= '" + description + '\'' +
                ", quantity= " + quantity +
                ", ";
    }
}
