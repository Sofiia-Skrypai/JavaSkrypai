package Homework.Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double grade;
    private String faculty;

    public Student(String name, int age, double grade, String faculty) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", Вік: " + age + ", Середній бал: " + grade + ", Факультет: " + faculty;
    }
}

