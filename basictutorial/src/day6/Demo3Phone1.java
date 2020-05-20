package day6;

public class Demo3Phone1 {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        one.brand = "Apple";
        one.price = 600;
        one.color = "black";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        one.call("Aaron");
        one.sendMessage();
    }
}
