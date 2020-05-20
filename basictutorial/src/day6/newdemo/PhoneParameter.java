package day6.newdemo;

public class PhoneParameter {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one);
        one.brand="apple";
        one.price=600;
        method(one,"Aaron");

        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        Phone three = method1(one,"Miley");
        System.out.println(three.brand);


    }
    public static void method(Phone param,String name) {
        System.out.println(param);
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
        param.call(name);
        param.sendMessage();
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        System.out.println(one);
        one.brand="apple";
        one.price=600;
        return one;
    }
    public static Phone method1(Phone param,String name) {
        System.out.println(param);
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
        param.call(name);
        param.sendMessage();
        param.brand = "new brand";
        Phone one = param;
        return one;
    }
}
