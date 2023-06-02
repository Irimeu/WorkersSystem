package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello World!");
        Employee pracownik1 = new Employee("", "", "", 123);
        Employee pracownik2 = new Employee("", "", "", 123);
        Employee pracownik3 = new Employee("", "", "", 123);
        System.out.println( pracownik1.getEmployeeID());
        System.out.println( pracownik2.getEmployeeID());
        System.out.println( pracownik3.getEmployeeID());

    }
}
