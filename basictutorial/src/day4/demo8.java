package day4;

public class demo8 {
    public static void main(String[] args) {
        System.out.println(sum1());
        System.out.println(sum2(100));
        sum3();
        sum4(100);
        System.out.println(getMax1(10, 20));
        System.out.println(getMax2(10, 20));

    }

    public static int sum1() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        return result;
    }

    public static int sum2(int x) {
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }

    public static void sum3() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println(result);
    }
    public static void sum4(int x) {
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        System.out.println(result);
    }
    public static int getMax1(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static int getMax2(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}


















