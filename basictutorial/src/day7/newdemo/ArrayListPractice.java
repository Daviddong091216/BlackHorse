package day7.newdemo;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int randomNumber = new Random().nextInt(33) + 1;
            if(!list.contains(randomNumber)){
                list.add(randomNumber);
                System.out.println(randomNumber);
            }

        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
