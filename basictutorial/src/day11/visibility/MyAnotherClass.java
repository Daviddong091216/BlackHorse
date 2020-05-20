package day11.visibility;

public class MyAnotherClass {
    public void method(){
        System.out.println(new MyClass().num1);
        System.out.println(new MyClass().num2);
        System.out.println(new MyClass().num3);
//        System.out.println(new MyClass().num4);
    }
}
