package day9;

public class Father {
    int numFather = 10;
    int num = 100;

    public Father() {
        System.out.println("Father method1.");
    }

    public Father(int num) {
        System.out.println("Father method2.");
    }

    public Father(int numFather, int num) {
        System.out.println("Father method3.");
        this.numFather = numFather;
        this.num = num;
    }

    public void methodFather() {
        System.out.println(num);
    }

    public void method() {
        System.out.println("Father method.");
    }


}
