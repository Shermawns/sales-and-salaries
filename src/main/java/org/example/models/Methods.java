package org.example.models;

import java.util.List;

public class Methods {
    public static double sumSalarys(List<Employee> list){
        double total = 0;
        for (Employee emp : list){
            total += emp.getSalary();
        }
        return total;
    }

}
