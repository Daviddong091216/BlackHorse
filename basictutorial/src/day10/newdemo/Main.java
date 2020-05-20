package day10.newdemo;

public class Main {
    public static void main(String[] args) {
        MyInterfaceImpl one = new MyInterfaceImpl();
        one.method1();
        System.out.println("================");
        one.method3();
        System.out.println("================");
        MyInterface.method2();

//        one.method4();
//        one.method5();
        System.out.println("================");
        System.out.println(one.NUM);
        System.out.println(one.NUM_OF_CLASS);


    }
}
