package day10;

public class MyInterfaceAMain {
    public static void main(String[] args) {
        MyInterfaceAImpl a = new MyInterfaceAImpl();
        a.methodDefault1();
        a.methodDefault1();
        MyInterfaceA.methodStatic1();
//        MyInterfaceA.method2();
    }
}
