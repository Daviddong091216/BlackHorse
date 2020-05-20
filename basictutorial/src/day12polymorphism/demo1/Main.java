package day12polymorphism.demo1;

public class Main {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
//        obj.methodZi();
//        Zi obj2 = new Fu();
        System.out.println(obj.num);
        System.out.println(obj.numFu);


    }
}
