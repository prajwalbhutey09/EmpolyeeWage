package com.bridgelabz;

public class EmpolyeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        final int WAGE_PER_HR = 20;
        final int FULL_DAY = 8;
        final int PART_TIME = 4;
        int pay = 0;

        int check = (int) (Math.floor(Math.random() * 10) % 3);
        switch (check) {
            case 0: {
                pay = WAGE_PER_HR * FULL_DAY;
                System.out.println("Employee is FULL TIME and wage is " + pay);
            }
            break;
            case 1: {
                pay = WAGE_PER_HR * PART_TIME;
                System.out.println("Employee is PART TIME and wage is " + pay);
            }
            break;
            default:
                System.out.println("Employee is Absent ");
        }
    }
}
