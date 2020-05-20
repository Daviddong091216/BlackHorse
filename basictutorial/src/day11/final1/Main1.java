package day11.final1;


public class Main1 {
    public static void main(String[] args) {
        final int num;
        num = 100;
        final Student stu1 = new Student("Aaron");
        System.out.println(stu1.getName());
        System.out.println(stu1);
//        stu1 = new Student("Miley");
        stu1.setName("Miley");
        System.out.println(stu1.getName());
        System.out.println(stu1);


    }


}
