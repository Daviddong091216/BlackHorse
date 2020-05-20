package day6;

public class Demo10Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Aaron");
        System.out.println(person.getName());
        person.setAge(4);
        System.out.println(person.getAge());
        person.show();

    }
}
