package com.array;

import java.util.Arrays;

/**
 *  Задание 6.
 * 	  Создайте массив строк. Заполните его произвольными именами людей.
 * 	  Отсортируйте массив. Результат выведите на консоль.
 */

public class Task6 {

    public static void main(String[] args) {

        String[] array = {"София", "Дарья", "Михаил", "Брунгильда", "Юлия", "Константин", "Валерий"};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
