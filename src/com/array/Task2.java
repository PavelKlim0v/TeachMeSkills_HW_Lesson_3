package com.array;

import java.util.Scanner;

/**
 *  Задание 2.
 * 	  Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
 * 	  Для генерации случайного числа используйте метод Math.random().
 * 	  Пусть будет возможность создавать массив произвольного размера.
 * 	  Пусть размер массива вводится с консоли.
 */

public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double[] firstArray = new double[num];             //массив с заданным размером пользователя случайных чисел
        double[] secondArray = new double[num];            //дополнительный массив для упорядочивания (max, min)
        int indexMax = 0;              //играет роль элемента массива (max)
        int indexMin = 0;              //играет роль элемента массива (min)
        double randomNum;
        double average;                //среднее значение от (max) к (min)

        for (int i = 0; i < num; i++) {
            randomNum = Math.random();
            firstArray[i] = randomNum;
            System.out.print("[" + i + "]" + " ");
            System.out.print(String.format(" " + "%.5f", firstArray[i]) + "\n");
        }
        double min = firstArray[0];         //отправная точка для нахождение минимального значения
        double max = 0;                     //отправная точка для нахождение максимального значения

        for (double elem : firstArray) {              //нахождение максимального числа
            if (elem > max) {
                max = elem;
                secondArray[indexMax] = max;
            } else if (elem < max) {
                elem = max;
                secondArray[indexMax] = max;
            }
            indexMax++;
        }
        for (double elem : firstArray) {              //нахождение минимального числа
            if (elem < min) {
                min = elem;
                secondArray[indexMin] = min;
            } else if (elem > min) {
                secondArray[indexMin] = min;
            }
            indexMin++;
        }
        average = (max + min)/2;                      //нахождение среднего числа
        System.out.print(String.format("Максимальное значение: " + "%.5f" + ".", max) + "\n");
        System.out.print(String.format("Минимальное значение: " + "%.5f" + ".", min) + "\n");
        System.out.print(String.format("Среднее значение: " + "%.5f" + ".", average) + "\n");
    }
}
