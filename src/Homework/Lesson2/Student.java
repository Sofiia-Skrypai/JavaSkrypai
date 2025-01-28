package Homework.Lesson2;
import java.util.ArrayList;
import java.util.List;

//Завдання 2: Клас Student
//Створіть клас Student, який має наступні поля:
//firstName (String) - ім'я студента
//lastName (String) - прізвище студента
//studentID (String) - номер студентського квитка
//grades (List<Integer>) - оцінки студента
//Додайте до класу наступні методи:
//addGrade(int grade) - додає нову оцінку до списку.
//calculateAverageGrade() - повертає середню оцінку студента.
//displayInfo() - виводить інформацію про студента, включаючи всі оцінки і середню оцінку.

public class Student {
    String firstName;
    String lastName;
    String studentID;
    List<Integer> grades;


    public Student(String firstName, String lastName, String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Student information:");
        System.out.println("Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Student ID number: " + studentID);
        System.out.println("Grades: " + grades);
        System.out.printf("Average rating: %.2f\n", calculateAverageGrade());
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("The score have to be between 0 and 100.");
        }
    }


    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }


    public static void main(String[] args) {
        Student student = new Student("Liza", "Poltorazka", "CD12345");
        student.displayInfo();

        student.addGrade(63);
        student.addGrade(78);
        student.addGrade(98);
        student.addGrade(114);

        student.displayInfo();
    }
}


