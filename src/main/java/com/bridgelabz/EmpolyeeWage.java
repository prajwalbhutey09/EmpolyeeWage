package com.bridgelabz;

public class EmpolyeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        final int WAGE_PER_HR = 20;
        final int FULL_DAY = 8;
        final int PART_TIME = 4;
        int pay = 0;

        double check = Math.floor(Math.random() * 10) % 3;
        if (check == 0) {
            pay = WAGE_PER_HR * FULL_DAY;
            System.out.println("Employee is FULL TIME and wage is " + pay);
        } else if (check == 1) {
            pay = WAGE_PER_HR * PART_TIME;
            System.out.println("Employee is PART TIME and wage is " + pay);

        } else {
            System.out.println("Employee is Absent ");
        }
    }
}
