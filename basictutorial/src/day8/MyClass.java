package day8;

public class MyClass {
    int num;
    static int numStatic;
    private int num1;
    private static int numStatic1;

//    public static MyClass(int num, int num1) {
//        this.num = num;
//        this.num1 = num1;
//    }

    public void method() {
        System.out.println("Common method.");
        System.out.println(this.num);
        System.out.println(this.numStatic);
        System.out.println(num1);
        System.out.println(numStatic1);
    }
    public static void staticMethod() {
        System.out.println("Static method.");
//        System.out.println(num);//Wrong!!
//        System.out.println(this.numStatic);
//        System.out.println(num1);//Wrong!!
        System.out.println(numStatic1);

    }
}
