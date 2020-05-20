package day4.overload;

public class MethodOverload {

    public static boolean isSame(byte a, byte b) {
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(double a, double b) {
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean aa(int a, int b) {
        return a == b;
    }

    public static boolean kk(double a, int b) {
        return a == b;
    }
}
