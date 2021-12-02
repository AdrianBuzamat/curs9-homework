package ro.fasttrackit.curs9.ex3;

import ro.fasttrackit.curs9.ex2.Employee;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Worker extends Employee {

    public Worker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getFullName() {
        return getFirstName() + getLastName();
    }

    public void getAge() {
        long years = ChronoUnit.YEARS.between(birthday, LocalDateTime.now());
        long months = ChronoUnit.MONTHS.between(birthday, LocalDateTime.now());

        System.out.println("years: " + years + " months: " + months % 12);


    }
}
