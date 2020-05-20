package day8;

public class Demo6StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
        MyClass.staticMethod();
        obj.staticMethod();
//        staticMethod();
//        method();
        MyClass.numStatic = 1000;
//        obj.num1 = 1000;
        System.out.println(MyClass.numStatic);
        int num1 = 100;
        System.out.println(num1);


    }
}
