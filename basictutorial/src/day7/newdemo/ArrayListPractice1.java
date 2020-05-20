package day7.newdemo;

import java.util.ArrayList;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList<String> children = new ArrayList<>();
        children.add("Nicole");
        children.add("Ethan");
        children.add("Miley");
        children.add("Aaron");
        System.out.println(children);
        printArrayList(children);

    }

    public static void printArrayList(ArrayList<String> arr) {
        System.out.print("{");
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                System.out.print(arr.get(i) + "}");
            } else {
                System.out.print(arr.get(i) + "@");
            }

        }
    }
}
