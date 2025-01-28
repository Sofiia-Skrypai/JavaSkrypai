package Homework.Lesson2;

//Вот еще задачка (одна в первой презентации и это вторая их выполнить до вторника)
//
//Часть 1: Создание класса
//Создайте класс Person с полями:
//
//private String name — имя.
//private int age — возраст.
//private final String id — уникальный идентификатор.
//Добавьте статическое поле:
//
//public static int totalPersons — общее количество объектов класса Person.
//        Создайте:
//
//Параметризованный конструктор для инициализации name, age, id.
//        Непараметризованный конструктор, который вызывает параметризованный с помощью ключевого слова this и задает значения по умолчанию: name = "Unknown", age = 18, id = "0000".
//Реализуйте геттеры и сеттеры для всех полей, кроме id (для id только геттер).
//
//В сеттере для возраста добавьте проверку: если возраст меньше 0, установите его в 0.
//
//Часть 2: Методы
//Создайте метод:
//
//public void printInfo() — выводит информацию о человеке (name, age, id) в консоль. Используйте ключевое слово this для доступа к полям объекта.
//Создайте статический метод:
//
//public static void printTotalPersons() — выводит общее количество объектов Person в консоль.
//Создайте метод с параметром:
//
//public boolean isOlderThan(int age) — возвращает true, если возраст текущего объекта больше переданного значения, иначе false.
//
//Часть 3: Основной метод
//В методе main класса Main:
//Создайте несколько объектов класса Person (например, p1, p2, p3) с разными параметрами.
//Вызовите для них метод printInfo().
//Проверьте работу метода isOlderThan(), передав разные значения.
//Вызовите статический метод printTotalPersons().
//
//Часть 4: Дополнительное задание
//Попробуйте сделать одно из полей name или age статическим и проверьте, как это повлияет на вывод информации для разных объектов.
//
//Добавьте метод:
//
//public final void displayGreeting() — выводит приветственное сообщение, например: Hello, my name is {name}!.

class Person {
    private String name;
    private int age;
    private final String id;
    public static int totalPersons = 0;

    // Parameterized constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = Math.max(age, 0); // Age validation
        this.id = id;
        totalPersons++;
    }

    // Non-parameterized constructor
    public Person() {
        this("Unknown", 18, "0000");
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0); // Age validation
    }

    public String getId() {
        return id;
    }

    // Method to print information
    public void printInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", ID: " + this.id);
    }

    // Static method to print total number of objects
    public static void printTotalPersons() {
        System.out.println("Total Persons: " + totalPersons);
    }

    // Method to compare age
    public boolean isOlderThan(int age) {
        return this.age > age;
    }

    // Final method for greeting
    public final void displayGreeting() {
        System.out.println("Hello, my name is " + this.name + "!");
    }


    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25, "1234");
        Person p2 = new Person("Bob", 30, "5678");
        Person p3 = new Person();

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();

        System.out.println("Is Alice older than 20? " + p1.isOlderThan(20));
        System.out.println("Is Bob older than 35? " + p2.isOlderThan(35));

        Person.printTotalPersons();

        p1.displayGreeting();
        p2.displayGreeting();
        p3.displayGreeting();
    }

}
