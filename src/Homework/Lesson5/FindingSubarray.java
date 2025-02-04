package Homework.Lesson5;
import java.util.Arrays;
//Задача : Поиск подмассива
//Условие:
//        Напишите программу, которая проверяет, содержится ли один массив в другом. Реализуйте с использованием метода Arrays.equals() для сравнения частей массивов.
//Пример ввода:
//Массив 1: [1, 2, 3, 4, 5, 6, 7]
//Массив 2: [3, 4, 5]
//
//Пример вывода:
//Массив 2 содержится в массиве 1.


import java.util.Arrays;

public class FindingSubarray {

    public void searchSubarray(int[] arr1, int[] arr2){
        boolean found = false;

        for (int i = 0; i <= arr1.length - arr2.length; i++) {
            if (Arrays.equals(Arrays.copyOfRange(arr1, i, i + arr2.length), arr2)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Масив 2 міститься в масиві 1.");
        } else {
            System.out.println("Масив 2 НЕ міститься в масиві 1.");
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {3, 4, 5};
        int[] array3= {3, 9, 5};

        FindingSubarray fs = new FindingSubarray();
        fs.searchSubarray(array1, array2);
        fs.searchSubarray(array1, array3);
        fs.searchSubarray(array3, array2);
    }

}
