package day8.newdemo;

public class StaticVariableMethod {
    int num1 = 0;
    private int num2 = 0;
    static int num3 = 0;
    private static int num4 = 0;

    public void method() {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(this.num3);
        System.out.println(num4);
    }

    public static void staticMethod() {
//        System.out.println(num1);
//        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
