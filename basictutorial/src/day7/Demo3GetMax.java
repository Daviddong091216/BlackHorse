package day7;

import java.util.Scanner;

public class Demo3GetMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First number: ");
        int num1 = input.nextInt();
        System.out.println("Second number: ");
        int num2 = input.nextInt();
        System.out.println("Third number: ");
        int num3 = input.nextInt();
        int temp = num1 > num2 ? num1 : num2;
        int max = num3 > temp ? num3 : temp;
        System.out.println(max);
    }
}
