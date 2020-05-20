package day8.newdemo;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] intArray = {9, 1, 2, 3};
        System.out.println(intArray);
        System.out.println(intArray[0]);

        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        System.out.println("===================");
        Arrays.sort(intArray);
        System.out.println(intArray);
        System.out.println(intArray[0]);
        System.out.println(Arrays.toString(intArray));

    }
}
