package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class task10 {

    public void calculate() {

        Scanner scanner = new Scanner(System.in);

        int elements_number;
        System.out.println("Provide an integer for multiplication:"); //we should multiply all elements for this number
        int provided_integer = scanner.nextInt();

        System.out.println("Enter how many elements to add to the array:");  //how long will the array be
        elements_number = scanner.nextInt();
        int a[] = new int[elements_number];

        System.out.println("Input numbers:");           //numbers that will create the array


        for (int i = 0; i < elements_number; i++) {     //multiplication of each number of the array list
            a[i] = scanner.nextInt();
            a[i] = a[i] * provided_integer;
        }
            System.out.println("New Array with the multiplied values is: " + Arrays.toString(a));
        }
    }

