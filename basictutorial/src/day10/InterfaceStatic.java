package day10;

public class InterfaceStatic implements MyInterfaceStatic{
    public static void main(String[] args) {
//        MyInterfaceStatic impl = new MyInterfaceStatic();
        MyInterfaceIml impl = new MyInterfaceIml();
//        impl.methodStatic();
        MyInterfaceStatic.methodStatic();
    }
}
