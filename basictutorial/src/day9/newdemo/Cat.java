package day9.newdemo;

public class Cat extends Animal {
    public Cat() {
        super();
        System.out.println("Cat constructor...");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat fish...");
    }
}
