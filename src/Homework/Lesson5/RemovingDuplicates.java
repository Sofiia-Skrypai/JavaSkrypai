package Homework.Lesson5;
import java.util.Arrays;
import java.util.Scanner;

//Задача : Удаление дубликатов
//Условие:
//        Напишите программу, которая удаляет все дубликаты из массива целых чисел. Используйте методы Arrays.sort() для предварительной сортировки и последующую логику удаления дубликатов.
//Пример ввода:
//Массив: [4, 2, 2, 8, 4, 6, 8, 1]
//
//Пример вывода:
//Массив без дубликатов: [1, 2, 4, 6, 8]


public class RemovingDuplicates {
    private Scanner scanner;
    private int[] array;

    public RemovingDuplicates() {
        scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        array = new int[n];
    }

    public void createArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
        }
        System.out.println("Original array: " + Arrays.toString(array));
    }

    public void deleteDuplicates() {
        Arrays.sort(array);
        int[] temp = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[array.length - 1];

        array = Arrays.copyOf(temp, j);
        System.out.println("Array without duplicates: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        RemovingDuplicates rd = new RemovingDuplicates();
        rd.createArray();
        rd.deleteDuplicates();
    }
}
