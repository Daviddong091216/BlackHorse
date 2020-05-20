package day7;

import java.util.Scanner;

public class Demo1Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Your number is:");
        System.out.println(num);
    }
}
