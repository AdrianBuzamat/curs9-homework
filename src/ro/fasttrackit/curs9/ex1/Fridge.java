package ro.fasttrackit.curs9.ex1;

public class Fridge extends Electronics{
    private String brand;
    private int temperature;

    public Fridge(String brand, int temperature){
        this.brand =brand;
        this.temperature=temperature;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    public int getTemperature() {
        return temperature;
    }





}
