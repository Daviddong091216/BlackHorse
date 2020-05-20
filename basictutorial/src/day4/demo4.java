package day4;

public class demo4 {
    public static void main(String[] args) {
        add(10, 20);
        System.out.println("=======");
        int sum = add(10, 20);
        System.out.println("===========");
        System.out.println(sum * 10);
        System.out.println("=========");

        System.out.println(add(1, 2));
        System.out.println("=========");
        System.out.println("=========");
        add1(10,20);
        System.out.println("=========");
        System.out.println(add2());
        System.out.println("=========");
        add3();

         int a = 0;
    }
    static int a = 0;
    public static int add(int a, int b) {
        System.out.println("I love you");
        return a + b;
    }
    public static void add1(int a, int b) {
        System.out.println("I love you: "+ (a + b));
    }
    public static int add2() {
        return 10;
    }
    public static void add3() {
//        a = 30;
        int b = 20;
    }

}