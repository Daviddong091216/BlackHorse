package day8;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo8Arrays {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3 };
        System.out.println(intArray);

        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        int[] array1 = {1, 5, 2, 9, 22, 6};
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println(array1);
        System.out.println(Arrays.toString(array1));








    }
}
