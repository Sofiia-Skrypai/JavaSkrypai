package Homework.Lesson2;

//Завдання 1: Клас Car
//Створіть клас Car, який має наступні поля:
//make (String) - марка автомобіля
//model (String) - модель автомобіля
//year (int) - рік випуску
//mileage (double) - пробіг
//Додайте до класу наступні методи:
//increaseMileage(double additionalMileage) - збільшує пробіг на задану величину.
//displayInfo() - виводить інформацію про автомобіль у форматованому рядку.
//

public class Car {
    String make;
    String model;
    int year;
    double mileage;

    Car(String m, String mod, int y, double mil){
        make = m;
        model = mod;
        year = y;
        mileage = mil;

    }

    double increaseMileage(double additionalMileage){
        return mileage += additionalMileage;
    }

    void displayInfo(){
        System.out.printf("Car: %s %s, Year: %d, Mileage: %.2f%n", make, model, year, mileage);
    }

    public static void main(String[] args) {
        Car car = new Car("Alfa Romeo", "Stelvio", 2018, 14000.0);
        car.displayInfo();

        car.increaseMileage(1000.0);
        car.displayInfo();
    }

}

