package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class demo1 {
    public static void main(String[] args) {
        System.out.println("Hello Miley!");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("===========");
        int[] sum1 = new int[100];
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum1[j] = i;
                j ++;
            }
        }
        for (int i = 0; i < sum1.length; i++) {
            System.out.println(sum1[i]);
        }
        System.out.println("===========");
        ArrayList<Integer> sum2 = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum2.add(i);
            }
        }
        for (int i = 0; i < sum2.size(); i++) {
            System.out.println(sum2.get(i));
        }
        System.out.println("===========");
        HashMap<Integer,Integer> sum3 = new HashMap<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum3.put(i,i);
            }
        }
        for (Integer item : sum3.values()) {
            System.out.println(item);
        }
        System.out.println("============");
        for(Map.Entry<Integer,Integer> item : sum3.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
