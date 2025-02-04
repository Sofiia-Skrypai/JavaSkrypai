package Homework.Lesson5;
import java.util.Scanner;

//Задача 1: Частота слов
//Условие:
//        Напишите программу, которая подсчитывает, сколько раз каждое слово встречается в тексте. Используйте методы split() и toLowerCase().
//Пример ввода:
//Введите текст: Java is great. Java is powerful. Java is fun.
//
//Пример вывода:
//Java: 3
//is: 3
//great: 1
//powerful: 1
//fun: 1


public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        countWordFrequency(text);

        scanner.close();
    }

    public static void countWordFrequency(String text) {
        text = text.toLowerCase();
        String[] words = text.split("\\W+"); // Розділяю за пробілами та знаками пунктуації

        System.out.println("Частота слів:");

        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) continue;
            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = ""; // Позначаю слово, щоб не рахувати його знову
                }
            }

            System.out.println(words[i] + ": " + count);
        }
    }
}

