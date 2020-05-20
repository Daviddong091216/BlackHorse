package day6;

public class Demo2Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "Aaron";
        stu1.age = 4;

        System.out.println(stu1.name);
        System.out.println(stu1.age);
        //System.out.println(stu1.eat());
        stu1.study();
        stu1.sleep();
        stu1.eat();
    }
}
