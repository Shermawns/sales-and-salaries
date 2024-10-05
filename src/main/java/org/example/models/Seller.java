package org.example.models;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Seller extends Employee{

    private List<Double> sales;

    public static double salary = 12000.00;

    public Seller(String name, LocalDate dateAdmit) {
        super(name, dateAdmit);
    }

    public Seller(String name, LocalDate dateAdmit, double[] salesArray) {
        super(name, dateAdmit);
        this.sales = new ArrayList<>();

        for (double sale : salesArray){
            this.sales.add(sale);
        }
    }

    public List<Double> getSales() {
        return sales;
    }

    public static void setSalary(double salary) {
        Seller.salary = salary;
    }

    public Double saleTotal(){
        double totalCommission = 0;
        for(double sale : sales) {
            totalCommission += sale * 0.3;
        }
        return totalCommission;
    }


    @Override
    public Double getSalary() {
        LocalDate date = LocalDate.now();
        long yearOnCompany = ChronoUnit.YEARS.between(getDateAdmit(), date);
        return salary + (yearOnCompany * 1800.00) + saleTotal();
    }
}
