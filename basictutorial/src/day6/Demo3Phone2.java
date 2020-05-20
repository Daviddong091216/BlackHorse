package day6;

public class Demo3Phone2 {
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
        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        two.brand = "samsung";
        two.price = 500;
        two.color = "white";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        two.call("Aaron");
        two.sendMessage();
    }
}
