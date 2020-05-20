package day4.newdemo;

public class GetSum {

    public static int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static int getSum(int num1, int num2) {
        return num1 + num2 ;
    }
//    public static void getSum(int num1, int num2) {
//    }

    public static int getSum(String num1, int num2) {
        return num2 ;
    }
    public static int getSum(int num2, String num1 ) {
        return num2 ;
    }
    public static int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int getSum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

}
