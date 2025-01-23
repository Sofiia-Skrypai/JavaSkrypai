package Homework;

//Створіть клас Book, який має наступні поля:
//title (String) - назва книги
//author (String) - автор книги
//yearPublished (int) - рік видання
//price (double) - ціна книги
//
//
//Додайте до класу наступні методи:
//discountPrice(double discount) - зменшує ціну на задану суму.
//displayInfo() - виводить інформацію про книгу, включаючи назву, автора, рік видання і ціну.



public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }


    public void discountPrice(double discount) {
        if (discount > 0 && discount <= price) {
            this.price -= discount;
        } else {
            System.out.println("The discount must be greater than 0 and less than or equal to the book price.");
        }
    }

    public void displayInfo() {
        System.out.println("Book information:");
        System.out.println("Name: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of publication: " + yearPublished);
        System.out.printf("Price: %.2f UAH\n", price);
    }

    public static void main(String[] args) {
        Book book = new Book("The Painted Veil", "Somerset Maugham", 1982, 300.0);
        book.displayInfo();

        book.discountPrice(65.0);
        book.displayInfo();

        book.discountPrice(756.0);
        book.displayInfo();
    }
}