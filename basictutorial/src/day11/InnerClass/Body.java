package day11.InnerClass;

import org.w3c.dom.ls.LSOutput;

public class Body {
    int num = 10;
    int n1 = 100;
//    n1 = 200;

    public class Heart {
        int num = 20;
        int n2 = 200;
//        n2 = 500;
        public void beat() {
            int num = 30;
            int n3 = 300;
            n3 = 500;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Body.this.num);
            System.out.println(n3);
            System.out.println(n2);
            System.out.println(n1);

//            System.out.println(Body.num);
//            System.out.println(super.num);

            System.out.println("Heart is beating.");
//            System.out.println(name);
        }
    }

    private String name;

    public void methodBody() {
        System.out.println("Out class method.");
        new Heart().beat();
        int n6 = 100;
//        n6 = 200;
        class Student{
            public void m1() {
                System.out.println(n6);
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
