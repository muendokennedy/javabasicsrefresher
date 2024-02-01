package com.kennedy;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Building a mortgage calculator

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");

        int principal = scanner.nextInt();

        System.out.print("Enter the annual interest rate: ");

        float annualInterest = scanner.nextFloat();

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Enter the period in years: ");

        byte years = scanner.nextByte();

        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("The Mortgage: " + mortgageFormatted);

    }
}