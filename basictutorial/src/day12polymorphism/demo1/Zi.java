package day12polymorphism.demo1;

public class Zi extends Fu {
//    @Override
    int num = 20;
    int numZi = 21;

    @Override
    public void method() {
        System.out.println("Sons method");
        System.out.println(num);
    }

    public void methodZi() {
        System.out.println("Only Sons have the method");
    }
}
