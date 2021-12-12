package com.array;

import java.util.Arrays;

/**
 *  Задание 3.
 * 	  Создайте 2 массива из 5 чисел.
 * 	  Выведите массивы на консоль в двух отдельных строках.
 * 	  Посчитайте среднее арифметическое элементов каждого массива и сообщите,
 * 	  для какого из массивов это значение оказалось больше
 * 	  (либо сообщите, что их средние арифметические равны)
 */

public class Task3 {

    public static double average1;
    public static double average2;

    public static void main(String[] args) {

        double[] array1 = {45,25,78,33,9};
        double[] array2 = {37,64,12,23,58};
        double[] sum1Array = new double[5];
        double[] sum2Array = new double[5];
        int index1 = 0;
        int index2 = 0;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (double elem : array1) {
            if (index1 > 0) {                         //со второго элемента массива [1]
                elem = elem + sum1Array[index1 - 1];  //начинаем складывать текущее значение с предыдущим, получаем сумму
            }
            sum1Array[index1] = elem;                 //текущий элемент становится суммой(предыдущего и текущего)
            index1++;
            if (index1 == sum1Array.length) {
                average1 = elem / sum1Array.length;
                System.out.println("Среднее арифметическое первого массива: " + average1);
            }
        }
        for (double elem : array2) {
            if (index2 > 0) {                         //со второго элемента массива [1]
                elem = elem + sum2Array[index2 - 1];  //начинаем складывать текущее значение с предыдущим, получаем сумму
            }
            sum2Array[index2] = elem;                 //текущий элемент становится суммой(предыдущего и текущего)
            index2++;
            if (index2 == sum2Array.length) {
                average2 = elem / sum2Array.length;
                System.out.println("Среднее арифметическое второго массива: " + average2);
            }
        }
        if (average1 > average2) {
            System.out.print("Первый массив больше второго.");
        } else if (average1 < average2) {
            System.out.print("Первый массив меньше второго.");
        } else if (average1 == average2) {
            System.out.print("Массивы равны между собой.");
        }
    }
}
