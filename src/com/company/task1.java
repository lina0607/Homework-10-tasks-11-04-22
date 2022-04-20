package com.company;

import java.util.Scanner;

public class task1 {
    public static void calculate() {

        Scanner scanner = new Scanner(System.in);


        int sum = 0;

        do {
            System.out.println("please enter a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

        } while (sum != 0);

        System.out.println(sum);

    }
}
