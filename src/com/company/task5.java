package com.company;

public class task5 {
    public static void calculate() {

        int[] table = new int[]{6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};
        int[] frequency = new int[table.length];

        int visited = -1;

        //loop through array and count frequency with which numbers appeared
        for (int i = 0; i < table.length; i++) {
            int count = 1;

            for (int j = i+1; j < table.length; j++) {
                if (table[i] == table[j]) {
                    count++;

        //to avoid counting the same number again
                    frequency[j] = visited;
                }
            }
            if (frequency[i] != visited)
                frequency[i] = count;
        }
        //display the frequency of each number

        for(int i = 0; i < table.length; i++){
            if(frequency[i] != visited)
                System.out.println(table[i] + " - " + frequency[i]);
        }
    }
}




