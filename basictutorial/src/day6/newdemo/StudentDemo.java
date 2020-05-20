package day6.newdemo;

public class StudentDemo {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("Aaron",3);
        System.out.println(stu2.getName());
        stu2.setName("Miley");
        System.out.println(stu2.getName());

    }

}
