package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class task10 {


    public void calculate() {

        Scanner scanner = new Scanner(System.in);

        int elements_number;
        System.out.println("Provide an integer for multiplication:"); //we should multiply all elements with this number
        int provided_integer = scanner.nextInt();

        System.out.println("Enter how many elements to add to the array:");  //how long will the array be
        elements_number = scanner.nextInt();
        int array [] = new int[elements_number];
        int[] arr2 = new int[array.length - 2];

        System.out.println("Input numbers:");           //numbers that will create the array


        for (int i = 0; i < elements_number; i++) {     //multiplication of each number of the array list
            array[i] = scanner.nextInt();
            //      array[i] = array[i] * provided_integer;
        }

        int value = provided_integer;

        for(int i = 0; i < array.length; i++) {
            if (i ==0 || i == array.length - 1) {
                continue;
            }
            //multiply the value of the elements with given value and save result to new array
            arr2[i - 1] = array[i] * value;
        }
        System.out.println(Arrays.toString(arr2));

        }
    }


