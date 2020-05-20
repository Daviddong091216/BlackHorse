package day9.newdemo;

public class Fu {
    int numFu = 10;
    int num = 100;

    public Fu() {
        System.out.println("Fu constructor no parameters");
    }

    public Fu(int num) {
        System.out.println("Fu constructor has parameters: " + num);
    }

    public void methodFu() {
        System.out.println(num);
    }

    public void method() {
        System.out.println("I love you Miley!");
    }
}
