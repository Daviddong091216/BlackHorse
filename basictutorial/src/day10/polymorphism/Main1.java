package day10.polymorphism;

public class Main1 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        Cat cat = (Cat) animal;
        cat.catchMouse();
        Cat cat1 = new Cat();
        cat1.catchMouse();
        cat1.eat();

        Animal animal1 = new Dog();
        Dog dog = (Dog) animal1;
        dog.eat();
        dog.watchHouse();
        animal1.eat();
//        animal1.watchHouse();
        System.out.println(animal1 instanceof Cat);
    }
}
