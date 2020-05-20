package day12polymorphism.demo2;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dogs eat meat");
    }
    public void watchHouse(){
        System.out.println("Dogs are watching house");
    }
}
