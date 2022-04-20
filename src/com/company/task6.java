package com.company;

import java.util.Scanner;

public class task6 {

    //Write a Java program to find the duplicate values of an array of integer values

    public static void calculate() {

        //Write a Java program to find the duplicate values of an array of integer values

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of inputs to expect:");
        int number_of_inputs = scanner.nextInt();

        int[] array = new int[number_of_inputs];
        int counter = 0;

        //create a loop that runs for the amount of inputs to expect
        do {
            System.out.println("Enter a number:");

            //add numbers to array
            int input = scanner.nextInt();
            array[counter++] = input;

        } while (counter < number_of_inputs);

        //search for duplicate number
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println("the duplicate number is: " + array[j]);
            }
        }
    }
}
