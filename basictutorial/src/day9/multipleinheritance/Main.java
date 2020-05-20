package day9.multipleinheritance;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new dog;
        CuteDog cuteDog = new CuteDog();
        cuteDog.eat();
        cuteDog.sleep();

        GoldenDog goldenDog = new GoldenDog();
        goldenDog.eat();
        goldenDog.sleep();

    }
}
