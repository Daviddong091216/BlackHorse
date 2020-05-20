package day11.visibility;

public class MyClass {
    public int num1= 10;
    protected int num2= 10;
    int num3= 10;
    private int num4= 10;

    public void method(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
