package com.array;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *  Задание 1.
 * 	  Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
 * 	  Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
 * 	  В результате должен быть новый массив без указанного числа.
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = {5, 3, 13, 34, 5, 8, 21};         //повторяется цифра 5 (два раза)
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : array) {            //вставляем все элементы из массива в список
            if (i != num) {              //кроме введенного числа
                result.add(i);
            }
        }
        String messageOutput = "Заданное число не входит в массив.\n";
        for (int x : array) {
            if (x == num) {
                messageOutput = "";
                break;
            }
        }
        System.out.print(messageOutput + result);
    }
}