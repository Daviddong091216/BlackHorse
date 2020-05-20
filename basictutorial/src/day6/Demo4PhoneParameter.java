package day6;

public class Demo4PhoneParameter {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 600;
        one.color = "black";
        method(one);
        Phone two = new Phone();
        two.brand = "sumsung";
        two.price = 500;
        two.color = "white";
        method(two);
    }
    public static void method(Phone parameter) {
        System.out.println(parameter.brand);
        System.out.println(parameter.price);
        System.out.println(parameter.color);
    }
}
