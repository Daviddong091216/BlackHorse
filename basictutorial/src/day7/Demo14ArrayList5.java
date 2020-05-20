package day7;

import java.util.ArrayList;
import java.util.Random;

public class Demo14ArrayList5 {
    public static void main(String[] args) {
//        Random random = new Random();
//        ArrayList<Integer> bigList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            int num = random.nextInt(100);
//            bigList.add(num);
//        }
        ArrayList<Integer> array1 = getBigArrayList(10, 10);
        System.out.println(array1);
        ArrayList<Integer> array2 = getSmallList(array1);
        System.out.println(array2);
        System.out.println(array2.size());

    }
    public static ArrayList<Integer> getBigArrayList(int numOfList, int numOfRange) {
        ArrayList <Integer> bigList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numOfList; i++) {
            int randomNumber = random.nextInt(numOfRange) + 1;
            bigList.add(randomNumber);
        }
        return bigList;
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> array) {
        ArrayList <Integer> smallList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            int num = array.get(i);
            if(num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}
