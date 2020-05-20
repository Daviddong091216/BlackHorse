package day4;

public class demo6 {
    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println(sum);
        print(30, 70);
//        System.out.println(print(30, 70));
//        System.out.println(void);
//        System.out.println(null);
    }
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void print(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}
