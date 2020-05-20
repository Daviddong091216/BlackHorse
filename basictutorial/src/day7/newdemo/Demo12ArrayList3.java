package day7.newdemo;

import day7.newdemo.Student;

import java.util.ArrayList;

public class Demo12ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("Ethan", 11);
        Student two = new Student("Miley", 8);
        Student three = new Student("Aaron", 4);

        list.add(one);
        list.add(two);
        list.add(three);
        System.out.println(list);
        /*for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu);
            System.out.println(stu.getName() + " " + stu.getAge());
        }*/
        for (Student student : list) {
            System.out.println(student.getName());
        }

    }
}
