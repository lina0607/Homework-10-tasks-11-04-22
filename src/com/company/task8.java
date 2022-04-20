package com.company;

public class task8 {

    public void calculate() {
        //Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
        //Sample array: [1,2,4,5,6]
        //Target value: 6

        int[] array = new int[]{1, 2, 4, 5, 6};
        int target_value = 6;

        //search for two elements
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == target_value) {
                System.out.println(array[i] + " + " + array[j] + " = 6");
                }
            }
        }
    }
}




