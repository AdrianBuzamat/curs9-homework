package ro.fasttrackit.curs9.ex3;

public class Main {
    public static void main(String[] args) {
        Worker pers = new Worker("Matei", "Ion");
        pers.setBirthday(1988, 11, 1, 0, 0);
        pers.setDateOfEmployment(2011, 10, 22, 0, 0);
        System.out.println(pers.getFullName());
        pers.getAge();
        System.out.println(pers.dateOfEmployment());
    }
}
