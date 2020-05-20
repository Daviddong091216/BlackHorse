package day7.newdemo;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();
        ArrayList<Boolean> list4 = new ArrayList<>();

        ArrayList<Student> list = new ArrayList<>();
        System.out.println(list);
        Student one = new Student("Ethan", 11);
        Student two = new Student("Miley", 8);
        Student three = new Student("Aaron", 4);
        Student four = new Student("mmm", 0);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(0).getName());
        System.out.println(list.remove(3));

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println(list.get(i).getName());
        }

        for (Student student : list) {
            System.out.println(student);
            System.out.println(student.getName());
        }

    }
}
