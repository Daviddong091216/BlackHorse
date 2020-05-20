package day8;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo4String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.next();
//        String str = "I love you!";
        ArrayList<Integer> list1 = new ArrayList<>();
        list1 = countChar(str);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }



    }
    public static ArrayList<Integer> countChar(String str) {
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        ArrayList<Integer> list = new ArrayList<>();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            System.out.println(ch);
            if ('A' <= ch && ch <= 'Z') {
                countUpper += 1;
            } else if ('a' <= ch && ch <= 'z') {
                countLower += 1;
            } else if ('0' <= ch && ch <= '9') {
                countNumber += 1;
            } else {
                countOther += 1;
            }
        }
        list.add(countUpper);
        list.add(countLower);
        list.add(countNumber);
        list.add(countOther);
        return list;
    }
}
