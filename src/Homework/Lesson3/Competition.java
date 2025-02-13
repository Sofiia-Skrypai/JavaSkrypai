package Homework.Lesson3;

//Задача: Проверка допуска к конкурсу
//Условие задачи:
//Вы организуете конкурс, и участники допускаются к нему только при выполнении всех следующих условий:
//
//Участнику должно быть от 18 до 35 лет включительно.
//Участник должен быть гражданином страны, указанной в списке допустимых стран (например, "Польша", "Украина", "Германия").
//Участник должен иметь уникальный номер заявки (не равный null или пустой строке).
//Участник не должен быть в "чёрном списке" (например, по фамилии).
//Необходимо:
//
//        Написать программу, которая проверяет выполнение условий для допуска участника.
//
//Запросить у пользователя:
//
//Возраст участника.
//Гражданство участника.
//Номер заявки.
//Фамилию участника.
//Использовать логические операторы (&&, ||, !) для проверки условий.
//
//Вывести в консоль одно из сообщений:
//
//        "Участник допущен к конкурсу."
//        "Участник не допущен к конкурсу."
//Пример ввода и вывода:
//Пример 1:
//
//Введите возраст участника: 25
//Введите гражданство участника: Польша
//Введите номер заявки: A12345
//Введите фамилию участника: Иванов
//Вывод:
//
//Участник допущен к конкурсу.
//Пример 2:
//
//Введите возраст участника: 40
//Введите гражданство участника: Германия
//Введите номер заявки: B67890
//Введите фамилию участника: Петров
//Вывод:
//
//Участник не допущен к конкурсу.
//        Пример 3:
//
//Введите возраст участника: 30
//Введите гражданство участника: Казахстан
//Введите номер заявки: C98765
//Введите фамилию участника: Сидоров
//Вывод:
//
//Участник не допущен к конкурсу.


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Competition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minAge = 18;
        int maxAge = 35;

        Set<String> allowedCountries = new HashSet<>();
        allowedCountries.add("Польща");
        allowedCountries.add("Україна");
        allowedCountries.add("Німеччина");

        Set<String> blacklist = new HashSet<>();
        blacklist.add("Засоба");
        blacklist.add("Зеря");

        System.out.print("Введіть вік учасника: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть громадянство учасника: ");
        String citizenship = scanner.nextLine().trim();

        System.out.print("Введіть номер заявки: ");
        String applicationNumber = scanner.nextLine().trim();

        System.out.print("Введіть прізвище учасника: ");
        String lastName = scanner.nextLine().trim();

        // Перевірка всіх умов
        boolean isAgeValid = age >= minAge && age <= maxAge;
        boolean isCitizenshipValid = allowedCountries.contains(citizenship);
        boolean isApplicationValid = !applicationNumber.isEmpty();
        boolean isNotBlacklisted = !blacklist.contains(lastName);

        if (isAgeValid && isCitizenshipValid && isApplicationValid && isNotBlacklisted) {
            System.out.println("Учасник допущений до конкурсу.");
        } else {
            System.out.println("Учасник не допущений до конкурсу.");
        }

        scanner.close();
    }
}
