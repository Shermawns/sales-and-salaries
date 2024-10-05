package org.example.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Manager extends Employee{
    public static Double salary = 20000.00;

    public Manager(String name, LocalDate dateAdmit) {
        super(name, dateAdmit);
    }

    @Override
    public Double getSalary() {
        LocalDate date = LocalDate.now();
        long yearsOnCompany = ChronoUnit.YEARS.between(getDateAdmit(),date);
        return salary + yearsOnCompany * 3000.00;
    }
}
