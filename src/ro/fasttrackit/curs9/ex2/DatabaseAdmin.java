package ro.fasttrackit.curs9.ex2;

public class DatabaseAdmin extends Employee {

    public DatabaseAdmin() {
        super();
    }

    @Override
    public String getAdress() {
        return "db admin: " + super.getAdress();
    }
}
