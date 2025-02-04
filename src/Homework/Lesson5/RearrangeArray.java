package Homework.Lesson5;

//Задача : Перестановка массива
//Условие:
//        Напишите программу, которая случайным образом переставляет элементы массива. Используйте метод Arrays.toString() для вывода.
//Подсказка: для перемешивания массива используйте класс Random.
//Пример ввода:
//Массив: [1, 2, 3, 4, 5]
//
//Пример вывода:
//Перемешанный массив: [3, 1, 5, 2, 4]


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RearrangeArray {
    private Scanner scanner;
    private int[] array;

    public RearrangeArray() {
        scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        array = new int[n];
    }

    public void createArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Original array: " + Arrays.toString(array));
    }

    public void rearrange() {
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        System.out.println("Array rearrangements: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        RearrangeArray ra = new RearrangeArray();
        ra.createArray();
        ra.rearrange();
    }
}
