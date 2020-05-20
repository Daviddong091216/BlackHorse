package day8.newdemo;

import java.util.ArrayList;

public class StringDemo1 {
    public static void main(String[] args) {

        char[] charArray = {'a', 'b', 'c'};
        String str1 = new String(charArray);
        String str2 = "abc";
        String str3 = "abc";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println("Abc".equals(str3));
        System.out.println("Abc".equalsIgnoreCase(str3));

        System.out.println("==================");

        System.out.println(str1.length());
        System.out.println(str1.charAt(0));
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.indexOf("a"));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.concat(str2));
        System.out.println(str1.trim());

        System.out.println("==================");

        System.out.println(str1.split(""));
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(0,2));

        System.out.println("==================");
        System.out.println(str1.toCharArray());
        System.out.println(str1.toCharArray()[0]);
        System.out.println(str1.getBytes());
        System.out.println(str1.getBytes()[0]);
        System.out.println(str1.replace("a","AA"));


        System.out.println("==================");
        System.out.println(str1.toString());
        System.out.println(str1.compareTo(str2));

    }
}
