package day7;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class demo4Anonymous {
    public static void main(String[] args) {
//        int num = new Scanner(System.in).nextInt();
//        System.out.println(num);
//        method(new Scanner(System.in));
        Scanner sc = method1();
        int num = sc.nextInt();
        System.out.println(num);
    }
    public static void method(Scanner input) {
        int num = input.nextInt();
        System.out.println(num);
    }
    public static Scanner method1() {
        return new Scanner(System.in);
    }

}
