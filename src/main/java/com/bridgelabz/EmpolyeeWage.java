package com.bridgelabz;

public class EmpolyeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        final int WAGE_PER_HR = 20;
        final int FULL_DAY = 8;
        int pay = 0;

        double check = Math.floor(Math.random() * 10) % 2;
        if (check == 0) {
            pay = WAGE_PER_HR * FULL_DAY;
            System.out.println("Employee is Present and wage is "+pay);
        } else
            System.out.println("Employee is Absent ");
    }

}
