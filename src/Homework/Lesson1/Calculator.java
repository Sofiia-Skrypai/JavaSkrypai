package Homework.Lesson1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? (num1 / num2) : Double.NaN;

        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + difference);
        System.out.println("Добуток: " + product);
        System.out.println("Частка: " + (num2 != 0 ? quotient : "Ділення на нуль неможливе"));

        scanner.close();
    }
}

