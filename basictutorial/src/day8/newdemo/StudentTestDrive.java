package day8.newdemo;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student one = new Student("Ethan", 11);
        Student two = new Student("Miley", 8);
        Student.room = "101 room";
        System.out.println(one.getId() + "  --" + one.getName() + one.getAge() + one.room);

        one.room = "102 room";
        System.out.println(two.getId() + "  --" + two.getName() + two.getAge() + Student.room);

    }
}
