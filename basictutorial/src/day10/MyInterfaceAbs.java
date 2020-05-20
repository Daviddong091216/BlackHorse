package day10;

public interface MyInterfaceAbs {

    public abstract void methodAbs1 ();

    int method();


    public default void method1() {
        System.out.println("This is default method.");
    }

}
