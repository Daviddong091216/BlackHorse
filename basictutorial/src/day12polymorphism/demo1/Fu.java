package day12polymorphism.demo1;

public class Fu {
    int num = 10;
    int numFu = 11;

    public void method() {
        System.out.println("Father method");
    }

    public void methodFu() {
        System.out.println("Only Father has the method");
        System.out.println(num);
    }
}
