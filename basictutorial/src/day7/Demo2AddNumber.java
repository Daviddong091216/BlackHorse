package day7;

import java.util.Scanner;

public class Demo2AddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1:");
        int num1 = input.nextInt();
        System.out.println("Number 2:");
        int num2 = input.nextInt();
        System.out.println("The sum is: "+ (num1 + num2));
    }
}
