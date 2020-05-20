package day9.newdemo;

public class Main {
    public static void main(String[] args) {
        Teacher one = new Teacher();
        one.setName("Aaron");
        one.method1();
        Employee.method2();
        System.out.println(one.getName());
        System.out.println("================");
        Assistant two = new Assistant();
        two.method1();

        System.out.println("================");

        Fu fu = new Fu();
        System.out.println(fu.numFu);
        System.out.println(fu.num);
        System.out.println("================");

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println(zi.num);
        System.out.println("================");
        zi.methodZi();
        System.out.println("================");
        zi.methodFu();
        System.out.println("================");
        zi.method();


        System.out.println("================");
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("================");
        NewPhone newphone = new NewPhone();
        newphone.call();
        newphone.send();
        newphone.show();
        System.out.println("================");
        Zi zi1= new Zi(10);

        System.out.println("================");
//        Animal animal = new Animal();
        Cat cat = new Cat();
        cat.eat();
        cat.normalMethod();


    }
}
