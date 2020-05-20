package day6;

public class Person {
    private String name;
    private int age;

    public void show() {
        System.out.println("name: " + name + "  age: " + age);
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        if (0 < num && num < 200) {
            age = num;
        } else {
            System.out.println("Wrong data!");
        }
    }

    public int getAge() {
        return age * 100;
    }

}
