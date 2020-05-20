package day02;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        int num = (int) 100000000000000000L;
        System.out.println(num);
        char ch = 'a';
        System.out.println(ch);
        System.out.println(ch + 0);
        int result = 20 % 3;
        System.out.println(result);
        String str1 = "Hello";
        String str2 = "Miley!";
        System.out.println(str1 + str2 + (11 + 22));
        int n1 = 10;
        int n2 = n1++ + 1;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(!(3 > 1));
        System.out.println(1 < 7 && 2 > 1 && 'a' < 'b');
        int n3 = 100;
        System.out.println(1 < 2 && n3++ < 9);
        System.out.println(n3);
        int a = 100;
        double b = 20.8;
        double max = a > b ? a : b;
        System.out.println(max);

        System.out.println(99999999L);
        int num1 =(int) 9999999999L;
        System.out.println(num1);
        long num2 = 9999999999999L;
        char z1= 'a';
        String str = "I love you Miley!";
//        String[] str1 = new String[str.length()];
        ArrayList<Character> str3 = new ArrayList<>();
        for (char cha : str.toCharArray()) {
            if (65 < cha && cha < 90) {
                str3.add(cha);
            }
        }
        System.out.println(str3);
        for (char cha : str3) {
            System.out.println(cha);
        }
        char z2 = '1';
        System.out.println(z2);
        System.out.println(z2 + 0);

        int num3 = 2;
        double num4 = 10.6;
        System.out.println(num4 % num3);
        System.out.println(num4 / num3);
        char z3 = 'c';
        System.out.println(z1 + z2);
        System.out.println(z1 - z2);
        String str5 = "aaaa";
        String str6 = "bbbb";
        System.out.println(str5 + str6);
//        System.out.println(str5 - str6);
        int num5 = 10;
        num5 %= 3;
        System.out.println(num5);
        System.out.println(1 < num5 || num5 < 7);

        int a1 = 70;
        int b1 = 20;
        int max1 = a1 > b1 ? a1 : b1;
        System.out.println(max1);
    }
}
