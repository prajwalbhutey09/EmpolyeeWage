package com.bridgelabz;

public class EmpolyeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        double check = Math.floor(Math.random() * 10) % 2;
        if (check == 0) {
            System.out.println("Employee is Present ");
        } else
            System.out.println("Employee is Absent ");
    }
}
