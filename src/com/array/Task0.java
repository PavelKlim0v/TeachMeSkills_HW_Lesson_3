package com.array;

import java.util.Scanner;

/**
 *  Задание 0.
 * 	  Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том,
 * 	  входит ли заданное число в массив или нет.
 * 	  Пусть число для поиска задается с консоли (класс Scanner).
 */

public class Task0 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int enterNum = scan.nextInt();
        int[] intArray = {5, 3, 13, 34, 8, 21};
        String result = "Это число НЕ входит в массив.";

        for (int x : intArray) {
            if (x == enterNum) {
                result = "Это число входит в массив.";
                break;
            }
        }
        System.out.println(result);
    }
}