package day10.polymorphism;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dogs eat meat.");
    }

    public void watchHouse() {
        System.out.println("Dog watches house.");
    }
}
