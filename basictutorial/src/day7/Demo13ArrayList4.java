package day7;

import java.util.ArrayList;

public class Demo13ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ethan");
        list.add("Miley");
        list.add("Aaron");
        System.out.println(list);
        printArrayList(list);

    }
    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() -1) {
                System.out.print(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }

    }


}
