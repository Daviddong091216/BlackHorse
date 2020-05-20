package day6;

public class Student2 {
    private String name;
    private int age;
    private boolean male;


//    public Student2(String name) {
//        System.out.println("It has portion parameters.");
//        this.name = name;
//    }


    public Student2() {
    }



    public Student2(String name) {
        this.name = name;
    }

    public Student2(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
