package day6.newdemo;

public class UseMethod {
    public static void main(String[] args) {
        int[] num1 = {1, 4, 6, 2, 8, 99};
        System.out.println(num1);
        printArray(num1);
        int[] result = calculate(1, 2, 3);
        System.out.println(result);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static void printArray(int[] arr) {
        System.out.println(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg};
        System.out.println(array);
        return array;
    }
}
