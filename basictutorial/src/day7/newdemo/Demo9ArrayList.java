package day7.newdemo;

import java.util.ArrayList;

public class Demo9ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean success = list.add("Ethan");
        //boolean ss = list.add(100);
        list.add("Miley");
        list.add("Aaron");
        list.add("lllllllll");
//        list.add(1);

        System.out.println(list);
        System.out.println(success);

        String name1 = list.get(1);
        System.out.println(name1);
        String remove = list.remove(3);
        System.out.println(remove);
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
