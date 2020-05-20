package day6;

public class Person1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(String who) {
        System.out.println(who + ", how are you? I am " + name);
        System.out.println(this);
    }
}
