package com.array;

import java.util.Arrays;

/**
 *  Задание 7.
 * 	  Реализуйте алгоритм сортировки пузырьком.
 */

public class Task7 {

    public static void main(String[] args) {

        int[] array = {5, 3, 13, 34, 8, 21};
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        System.out.println(Arrays.toString(array));
    }
}
