package org.example.models;

import java.time.LocalDate;
import java.util.List;

public class Employee {
    private String name;
    protected Double salary;
    protected LocalDate dateAdmit;

    public Employee() {
    }

    public Employee(String name, LocalDate dateAdmit) {
        this.name = name;
        this.dateAdmit = dateAdmit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getDateAdmit() {
        return dateAdmit;
    }

    public void setDateAdmit(LocalDate dateAdmit) {
        this.dateAdmit = dateAdmit;
    }

}
