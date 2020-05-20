package day6.newdemo;

import day6.Student;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "Aaron";
        stu.eat();
        System.out.println(stu.name);
        System.out.println(stu);
    }
}
