package org.example;

import org.example.models.*;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        List <Employee> list = new ArrayList<>();

        LocalDate date = LocalDate.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/yyyy");

        list.add(new Secretary("Jorge Carvalho", YearMonth.parse("01/2018",fmt1).atEndOfMonth()));
        list.add(new Secretary("Maria Souza", YearMonth.parse("12/2015",fmt1).atEndOfMonth()));

        list.add(new Seller("Ana Silva", YearMonth.parse("12/2021",fmt1).atEndOfMonth(),new double[]{5200, 4000, 4200, 5850, 7000}));
        list.add(new Seller("João Mendes", YearMonth.parse("12/2021",fmt1).atEndOfMonth(),new double[]{3400, 7700, 5000, 5900, 6500}));

        list.add(new Manager("Juliana Alves", YearMonth.parse("07/2017", fmt1).atEndOfMonth()));
        list.add(new Manager("Bento Albino", YearMonth.parse("03/2014", fmt1).atEndOfMonth()));



        System.out.println("Valor total pago em salários: " + Methods.sumSalarys(list));
        System.out.println("Salário mais alto : " + Methods.getHighestSalary(list));

    }
}