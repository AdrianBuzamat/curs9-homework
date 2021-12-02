package ro.fasttrackit.curs9.ex2;

import java.time.LocalDateTime;

public class Employee implements Person {
    private String firstName;
    private String lastName;
    private String adress;
    private LocalDateTime birthday;
    private String position;
    private LocalDateTime dayOfEmployment;

    public Employee() {

    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName + " ";
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public LocalDateTime getBirthday() {
        return birthday;
    }

    public LocalDateTime dateOfEmployment() {
        return dayOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public void setBirthday(int year, int month, int day, int hour, int minute) {

        this.birthday = LocalDateTime.of(year, month, day, hour, minute);
    }

    public void setDateOfEmployment(int year, int month, int day, int hour, int minute) {
        this.dayOfEmployment = LocalDateTime.of(year, month, day, hour, minute);
    }
}
