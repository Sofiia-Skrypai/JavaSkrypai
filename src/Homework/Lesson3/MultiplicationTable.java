package Homework.Lesson3;

//Условие задачи:
//        Напишите программу, которая:
//        Запрашивает у пользователя число N (от 1 до 10).
//        Генерирует и выводит таблицу умножения для этого числа от 1 до 10.
//
//        Пример ввода и вывода:
//        Пример 1:
//        Введите число: 5
//        Вывод:
//        Таблица умножения для числа 5:
//        5 x 1 = 5
//        5 x 2 = 10
//        5 x 3 = 15
//        5 x 4 = 20
//        5 x 5 = 25
//        5 x 6 = 30
//        5 x 7 = 35
//        5 x 8 = 40
//        5 x 9 = 45
//        5 x 10 = 50
//

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        demonstrateMultiplicationTable();
    }

    public static void demonstrateMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (from 1 to 10): ");
        int N = scanner.nextInt();

        if (N < 1 || N > 10) {
            System.out.println("Error: the number must be between 1 and 10.");
        } else {
            System.out.println("Multiplication table for the number " + N + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + (N * i));
            }
        }

        scanner.close();
    }
}

