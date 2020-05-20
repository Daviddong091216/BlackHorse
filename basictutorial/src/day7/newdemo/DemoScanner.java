package day7.newdemo;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = input.nextInt();
        System.out.println("Your number is : " + num);
        System.out.println("Please enter a string:");
        String str = input.next();
        System.out.println("Your string is : " + str);


    }
}
