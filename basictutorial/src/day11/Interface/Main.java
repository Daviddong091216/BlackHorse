package day11.Interface;

import day10.MyInterfaceAImpl;

public class Main {
    public static void main(String[] args) {
//        MyInterfaceImpl impl = new MyInterfaceImpl();
//        MyInterface impl = new MyInterfaceImpl();
//        impl.method();
        MyInterface some = new MyInterface() {
            @Override
            public void method() {
                System.out.println("Override method.");
            }
        };
        some.method();
        some.method();



    }
}
