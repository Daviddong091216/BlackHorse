package day8;

import java.util.Arrays;

import static java.lang.Math.PI;

public class Demo9ArraysPractice {
    public static void main(String[] args) {
        String str = "akshdaslfkbkdlbcnaslknl";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(str);
        System.out.println(chars);
        for (int i = chars.length -1; i >= 0 ; i--) {
            System.out.println(chars[i]);
        }

    }

}
