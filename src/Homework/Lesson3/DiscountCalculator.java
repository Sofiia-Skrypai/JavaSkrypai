package Homework.Lesson3;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть суму покупки (у грн): ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Помилка: введене значення не є числом.");
            return;
        }
        double purchaseAmount = scanner.nextDouble();

        if (purchaseAmount < 0) {
            System.out.println("Помилка: сума покупки не може бути від'ємною.");
            return;
        }

        System.out.print("Клієнт VIP (true/false): ");
        if (!scanner.hasNextBoolean()) {
            System.out.println("Помилка: введіть true або false.");
            return;
        }
        boolean isVip = scanner.nextBoolean();

        double discountPercent = 0;
        if (purchaseAmount >= 1000 && purchaseAmount <= 5000) {
            discountPercent = 5;
        } else if (purchaseAmount > 5000 && purchaseAmount <= 10000) {
            discountPercent = 10;
        } else if (purchaseAmount > 10000) {
            discountPercent = 15;
        }

        // Обчислення знижки
        double discountAmount = (purchaseAmount * discountPercent) / 100;
        double finalAmount = purchaseAmount - discountAmount;

        // Додаткова знижка для VIP-клієнтів
        double vipDiscountAmount = 0;
        if (isVip) {
            vipDiscountAmount = (finalAmount * 5) / 100;
            finalAmount -= vipDiscountAmount;
        }

        // Вивід результатів
        System.out.printf("Сума покупки до знижки: %.2f грн%n", purchaseAmount);
        if (discountPercent > 0) {
            System.out.printf("Знижка: %.0f%% (%.2f грн)%n", discountPercent, discountAmount);
        } else {
            System.out.println("Знижка: відсутня");
        }
        if (isVip) {
            System.out.printf("Додаткова знижка для VIP: 5%% (%.2f грн)%n", vipDiscountAmount);
        }
        System.out.printf("Ітогова сума до оплати: %.2f грн%n", finalAmount);

        scanner.close();
    }
}

