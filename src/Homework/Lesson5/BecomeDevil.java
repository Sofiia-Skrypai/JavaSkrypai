package Homework.Lesson5;

import java.util.Scanner;


public class BecomeDevil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Оцініть свій настрій від 1 до 100: ");
        int mood = scanner.nextInt();

        String moodDescription = (mood > 80) ? "У вас чудовий настрій! 😊" :
                (mood > 60) ? "У вас гарний настрій! 😀" :
                        (mood > 40) ? "Ваш настрій середній. 😐" :
                                (mood > 20) ? "Ви трохи засмучені. 😕" :
                                        (mood > 0) ? "У вас поганий настрій. 😞" : "Ви мертві! ☠";

        System.out.println("Ваш настрій: " + moodDescription);

        scanner.close();
    }
}
