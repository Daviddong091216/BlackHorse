package day6;

public class Demo5PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 666;
        one.color = "red";
        return one;
    }
}
