package day4;

public class demo5 {
    public static void main(String[] args) {
        method1(10, 20);
        method2();
        method3(2);
    }
    public static void method1(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
    public static void method2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I love you!");
        }
    }
    public static void method3(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("I love you!!!");
        }
    }
}
