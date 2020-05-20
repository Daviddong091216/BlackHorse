package day9.newdemo;

public abstract class Animal {
    public Animal() {
        System.out.println("Animal constructor..");
    }

    public abstract void eat();

    public void normalMethod() {
        System.out.println("normal method...");
    }
}
