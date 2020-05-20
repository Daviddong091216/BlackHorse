package day7.newdemo;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = selectArray(10);
        System.out.println("The total number is : " + intArray.size());
        for (int i = 0; i < intArray.size(); i++) {
            System.out.println(intArray.get(i));
        }

    }

    public static ArrayList<Integer> selectArray(int num) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int countNum = 0;
        while (countNum < num) {
            int randomNum = new Random().nextInt(101);
            if (!arr.contains(randomNum)) {
                arr.add(randomNum);
                countNum++;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                tempArray.add(arr.get(i));
            }
        }
        return tempArray;
    }
}
