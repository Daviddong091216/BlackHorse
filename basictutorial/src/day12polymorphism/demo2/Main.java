package day12polymorphism.demo2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        System.out.println(animal instanceof Cat);
        Cat cat = (Cat) animal;
        cat.catchMouse();

        Animal animal1 = new Dog();

        System.out.println(animal1 instanceof Cat);
        Dog dog = (Dog) animal1;
        dog.watchHouse();

    }
}
