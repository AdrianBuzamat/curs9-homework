package ro.fasttrackit.curs9.ex2;

public class Programmer extends Employee {

    private String language;

    public Programmer() {
        super();
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}
