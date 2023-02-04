package com.bridgelabz;

public class EmpolyeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        final int WAGE_PER_HR = 20;
        int working_hour = 0;
        int pay = 0;
        final int MONTLY_WORKING_DAY = 20;
        int total = 0;
        for (int day = 1; day <= MONTLY_WORKING_DAY; day++) {
            int check = (int) (Math.floor(Math.random() * 10) % 3);
            switch (check) {
                case 0: {
                    working_hour = 8;
                }
                break;
                case 1: {
                    working_hour = 4;
                }
                break;
                default:
                    working_hour = 0;
            }
            pay = WAGE_PER_HR * working_hour;
            total = total + pay;
        }
        System.out.println("monthly wage of enployee " + total);
    }
}