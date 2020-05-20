package day12polymorphism.demo2;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cats eat fish");
    }

    public void catchMouse() {
        System.out.println("Cats catch mouse");
    }
}
