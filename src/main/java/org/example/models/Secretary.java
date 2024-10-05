package org.example.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Secretary extends Employee{
    public static Double salary = 7000.00;
    public Secretary(String name, LocalDate dateAdmit) {
        super(name, dateAdmit);
    }

    @Override
    public Double getSalary() {
        LocalDate date = LocalDate.now();
        long yearsOnCompany = ChronoUnit.YEARS.between(getDateAdmit(), date);
        double salaryNew = salary + (yearsOnCompany * 1000);
        return salaryNew + salaryNew * 0.2;
    }

}
