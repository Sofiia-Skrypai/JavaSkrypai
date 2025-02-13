package Homework.Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentManagementSystem {
    private static final List<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nМеню:");

            System.out.println("1. Додати студента");
            System.out.println("2. Показати всіх студентів");
            System.out.println("3. Пошук студентів за середнім балом");
            System.out.println("4. Пошук студентів за віком");
            System.out.println("5. Пошук студентів за факультетом");
            System.out.println("6. Видалити студента за ім'ям");
            System.out.println("7. Вийти");
            System.out.print("Оберіть опцію: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showAllStudents();
                    break;
                case 3:
                    searchByGrade();
                    break;
                case 4:
                    searchByAge();
                    break;
                case 5:
                    searchByFaculty();
                    break;
                case 6:
                    deleteStudentByName();
                    break;
                case 7:
                    System.out.println("Програма завершена.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Невідома опція. Спробуйте ще раз.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Введіть ім'я студента: ");
        String name = scanner.nextLine();

        System.out.print("Введіть вік студента: ");
        int age = scanner.nextInt();

        System.out.print("Введіть середній бал студента: ");
        double grade = scanner.nextDouble();
        scanner.nextLine(); // Очистка буфера

        System.out.print("Введіть факультет студента: ");
        String faculty = scanner.nextLine();

        students.add(new Student(name, age, grade, faculty));
        System.out.println("Студента додано!");
    }

    private static void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Список студентів порожній.");
        } else {
            System.out.println("Список студентів:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void searchByGrade() {
        System.out.print("Введіть мінімальний середній бал: ");
        double minGrade = scanner.nextDouble();
        scanner.nextLine(); // Очистка буфера

        System.out.println("Студенти з середнім балом вище " + minGrade + ":");
        for (Student student : students) {
            if (student.getGrade() > minGrade) {
                System.out.println(student);
            }
        }
    }

    private static void searchByAge() {
        System.out.print("Введіть мінімальний вік: ");
        int minAge = scanner.nextInt();
        System.out.print("Введіть максимальний вік: ");
        int maxAge = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        System.out.println("Студенти у віковому діапазоні " + minAge + " - " + maxAge + ":");
        for (Student student : students) {
            if (student.getAge() >= minAge && student.getAge() <= maxAge) {
                System.out.println(student);
            }
        }
    }

    private static void searchByFaculty() {
        System.out.print("Введіть факультет для пошуку: ");
        String faculty = scanner.nextLine().trim();

        System.out.println("Студенти факультету " + faculty + ":");
        for (Student student : students) {
            if (student.getFaculty().equalsIgnoreCase(faculty)) {
                System.out.println(student);
            }
        }
    }

    private static void deleteStudentByName() {
        System.out.print("Введіть ім'я студента для видалення: ");
        String nameToDelete = scanner.nextLine().trim();

        boolean removed = students.removeIf(student -> student.getName().equalsIgnoreCase(nameToDelete));

        if (removed) {
            System.out.println("Студента '" + nameToDelete + "' видалено.");
        } else {
            System.out.println("Студента з ім'ям '" + nameToDelete + "' не знайдено.");
        }
    }
}
