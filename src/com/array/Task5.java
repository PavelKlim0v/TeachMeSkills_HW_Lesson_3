package com.array;

import java.util.Arrays;

/**
 *  Задание 5.
 * 	  Создайте массив и заполните массив. Выведите массив на экран в строку.
 * 	  Замените каждый элемент с нечётным индексом на ноль.
 * 	  Снова выведете массив на экран на отдельной строке.
 */

public class Task5 {

    public static void main(String[] args) {

        int[] array = {5, 3, 13, 34, 8, 21};
        System.out.println(Arrays.toString(array));
        int i = 0;
        for (int elem : array) {
            if (array[i] % 2 == 0) {
                array[i] = elem;
            } else if (array[i] % 2 != 0) {
                elem = 0;
                array[i] = elem;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
