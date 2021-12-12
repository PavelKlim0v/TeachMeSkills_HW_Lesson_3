package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *  Задание 4.
 * 	  1)Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
 * 	  2)Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 * 	  3)Создайте массив из n случайных целых чисел и выведите его на экран.
 * 	  4)Если n не удовлетворяет условию - выведите сообщение об этом.
 * 	  5)Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */

public class Task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int enterNum = scan.nextInt();
        int[] firstArray = new int[enterNum];              //массив с заданным размером пользователя случайных чисел
        ArrayList<Integer> secondArray = new ArrayList<>();          //массив для четных чисел
        int randomNum;

        if ((enterNum > 5) && (enterNum <= 10)) {
            for (int i = 0; i < enterNum; i++) {                     //заполняем первый массив случайными значениями
                randomNum = (int) (Math.random() * 10);
                firstArray[i] = randomNum;
                if ((randomNum % 2 == 0) && (randomNum != 0)) {      //если элемент четный добавляем во второй
                    secondArray.add(randomNum);                      //массив, где только четные значения
                }
            }
            System.out.println(Arrays.toString(firstArray));
            System.out.println(secondArray);
        } else if ((enterNum <= 5) || (enterNum > 10)) {
            System.out.println("Неподходящее число, повторите ввод.");
        }
    }
}
