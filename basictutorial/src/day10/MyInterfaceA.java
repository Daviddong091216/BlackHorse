package day10;

public interface MyInterfaceA {
    public static final int num = 10;

    public default void methodDefault1() {
        System.out.println("Default 1");
        method1();
    }
    public default void methodDefault2() {
        System.out.println("Default 2");
        method1();
    }
    private  void method1(){
        System.out.println("AAAAA");
    }
    public static void methodStatic1() {
        System.out.println("Static 1");
        method2();
//        method1();
    }
    public static void methodStatic2() {
        System.out.println("Static 2");
        method2();
    }

    private static void method2(){
        System.out.println("BBBBB");
    }






}
