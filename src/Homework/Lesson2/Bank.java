package Homework.Lesson2;

//Створіть клас Bank, який має наступні поля:
//name (String) - назва банку
//balance (double) - баланс рахунку
//interestRate (double) - відсоткова ставка
//Додайте до класу наступні методи:
//deposit(double amount) - збільшує баланс на задану суму.
//withdraw(double amount) - зменшує баланс на задану суму, якщо на рахунку достатньо грошей.
//applyInterest() - збільшує баланс на відсоткову ставку.
//displayInfo() - виводить інформацію про банк, включаючи баланс і відсоткову ставку.


public class Bank {
     String name;
     double balance;
     double interestRate;


    public Bank(String name, double initialBalance, double interestRate) {
        this.name = name;
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount " + amount + " deposited successfully.");
        } else {
            System.out.println("Cannot deposit a negative amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Cannot withdraw a negative amount.");
        }
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of " + interest + " applied.");
    }

    public void displayInfo() {
        System.out.println("Bank: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        Bank myBank = new Bank("ПриватБанк", 1000.0, 5.0);

        myBank.displayInfo();

        myBank.deposit(500.0);
        myBank.withdraw(200.0);
        myBank.applyInterest();
        myBank.displayInfo();
        }
}
