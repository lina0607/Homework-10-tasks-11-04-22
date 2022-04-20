package com.company;

import java.util.Scanner;

public class task3 {
    public void calculate() {

        //Write a program that takes an integer from the user and prints all its divisors in the console, each divisor in separate line.

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter an integer: ");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {

                System.out.println(i);
            }
        }
    }
}
