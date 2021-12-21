package org.example;

public class UC2 {
    public static void main(String[]args) {
        //Constants
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;

        //Variables
        int emphrs = 0;
        int empwages = 0;

        //Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            emphrs = 8;
        else
            emphrs = 0;
        empwages = emphrs * EMP_RATE_PER_HOUR;
        System.out.println("EmpWage " + empwages);

    }

    }
