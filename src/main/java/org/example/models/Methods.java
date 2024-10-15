package org.example.models;

import java.time.YearMonth;
import java.util.List;

public class Methods {
    public static double sumSalarys(List<Employee> list){
        double total = 0;
        for (Employee emp : list){
                total += emp.getSalary();
        }
        return total;
    }

    public static String getHighestSalary(List<Employee> employees) {
        Employee highest = null;
        for (Employee emp : employees) {
            if (highest == null || emp.getSalary() > highest.getSalary()) {
                highest = emp;
            }
        }
        return (highest != null) ? highest.getName() : "Nenhum funcionário encontrado";
    }


}
