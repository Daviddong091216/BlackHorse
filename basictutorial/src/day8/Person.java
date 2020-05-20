package day8;

public class Person {
    static {
        System.out.println("Only execute one time!!");
    }

    public Person() {
        System.out.println("Person class execute.");
    }
}
