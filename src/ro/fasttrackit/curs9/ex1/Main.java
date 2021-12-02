package ro.fasttrackit.curs9.ex1;

public class Main {
    public static void main(String[] args) {
        Cosmetics gloss = new Cosmetics();
        gloss.setName("Glossy gloss");
        gloss.setDescription("Gloss for lips");
        gloss.setColor("red");
        gloss.setPrice(12.33);
        gloss.setWeight(2.3);
        gloss.setQuantity(10);

        System.out.println(gloss);

        System.out.println("----------------------------------------");

        Fridge refrigerator = new Fridge();
        refrigerator.setName("Arctic");
        refrigerator.setTemperature(6);
        refrigerator.setType("refrigerator");
        refrigerator.setPrice(999.99);
        refrigerator.setDescription("Refrigerator for fruits");
        refrigerator.setQuantity(1);
        refrigerator.setLength(600);
        refrigerator.setWidth(600);
        refrigerator.setHeight(1800);
        refrigerator.setWeight(44.4);
        System.out.println(refrigerator);
    }
}
