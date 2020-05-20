package day6.newdemo;

public class PhoneTestDrive {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one);
        one.call("Aaron");
        one.sendMessage();
        System.out.println(one.brand);
        one.brand = "apple";
        System.out.println(one.brand);

        Phone two = one;
        System.out.println(two);
        System.out.println(two.brand);
        two.sendMessage();
        two.brand = "Samsong";

        System.out.println(one.brand);
        System.out.println(two.brand);

    }
}
