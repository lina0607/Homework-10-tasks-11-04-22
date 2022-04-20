package com.company;

import java.util.Scanner;

public class task2 {

    public static void calculate() {

        Scanner scanner = new Scanner(System.in);

        int min_number = 0;
        int max_number = 0;
        int input;

        do {
            System.out.println("Enter a number:");
            input = scanner.nextInt();

            if (input > max_number)
                max_number = input;

            if (input < min_number)
                min_number = input;
        }
        while (input != 0);

        double sum = max_number + min_number;
        System.out.println(sum);

        double average = sum / 2;
        System.out.println(average);

    }
}

