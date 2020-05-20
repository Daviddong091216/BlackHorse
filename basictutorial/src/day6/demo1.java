package day6;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 55, 99, 3, 7 };
        printArray(array1);
//        System.out.println(Arrays.toString(array1));
    }
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
