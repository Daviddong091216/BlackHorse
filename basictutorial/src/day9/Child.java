package day9;

public class Child extends Father {
    int numChild = 20;
    int num = 200;

    public Child() {
        super();
        System.out.println("child method1");
    }

    public Child(int num, int numChild1) {
        super(num);
        System.out.println("child method2");

        numChild = numChild1;
    }

    public void methodChild() {
        int num1 = 300;
        System.out.println(num1);
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    @Override
    public void method() {
        super.method();
        System.out.println(num);
        System.out.println("child method!");
        System.out.println("I love you! Miley!");
    }
}
