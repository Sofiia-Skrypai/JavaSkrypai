package Homework.Lesson1;

public class B {
    public void printValue(){
        A testA = new A();
        System.out.println("Public: " + testA.a);
        System.out.println("Protected: " + testA.b);
        System.out.println("Default: " + testA.c);
        System.out.println("Private: " + testA.getPrivate());
    }
}
