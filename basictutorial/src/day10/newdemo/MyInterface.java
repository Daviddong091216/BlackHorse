package day10.newdemo;

public interface MyInterface {
    public final static int NUM = 100;
    public final static int NUM_OF_CLASS = 102;

    void method1();

    static void method2() {
        System.out.println("Static method...");
//        method4();
        method5();
    }

    default void method3() {
        System.out.println("default method...");
        method4();
        method5();
    }

    private void method4() {
        System.out.println("private method");
        method5();
    }

    private static void method5() {
        System.out.println("private method");
    }

}
