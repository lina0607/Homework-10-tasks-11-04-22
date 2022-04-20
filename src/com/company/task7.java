package com.company;

import java.util.Scanner;

public class task7 {

    //Write a Java program to get the difference between the largest and smallest values in an array of integers.
    // The length of the array must be 1 and above.
    public void calculate() {

        Scanner scanner = new Scanner(System.in);
        int smallest_value = 0;
        int largest_value = 0;
        int number;

        do {
            System.out.println("please enter a number: ");
            number = scanner.nextInt();

            int[] values = new int[number];

            if (number > largest_value)
                largest_value = number;

            if (number < smallest_value)
                smallest_value = number;

        } while (number >= 1);

        double difference = largest_value - smallest_value;
        System.out.println("The difference between the largest and smallest values is: " + difference);
    }
}
