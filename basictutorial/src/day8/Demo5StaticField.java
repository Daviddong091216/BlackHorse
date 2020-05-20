package day8;

public class Demo5StaticField {
    public static void main(String[] args) {
        Student.room = "101 class room";
//        one.room = "101 class room";

        Student one = new Student("Ethan", 11);

        Student two = new Student("Miley", 8);
        System.out.println(one.getName() +
                one.getAge() +
                Student.room + " " + one.getId());
        System.out.println(two.getName() +
                two.getAge() +
                Student.room + " " + two.getId());


    }
}
