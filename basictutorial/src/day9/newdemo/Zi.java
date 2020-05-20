package day9.newdemo;

public class Zi extends Fu {
    int numZi = 20;
    int num = 200;

    public Zi() {
        super(10);
        System.out.println("Zi constructor");
    }

    public Zi(int num) {
        super();
        System.out.println("Zi constructor has parameter: " + num);
    }

    public void methodZi() {
        int num = 1000;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
        System.out.println(numZi);
        System.out.println(numFu);

    }

    @Override
    public void method() {
//        super();
        System.out.println("I love you Miley, Aaron!");
        super.method();
    }
}
