package day6.newdemo;

import org.w3c.dom.ls.LSOutput;

public class VariableDifference {

    String name;

    public void methodA() {
        int num = 20;
        System.out.println(num);
    }

    public void methodB(int para) {
//        System.out.println(num);
        int age;
//        System.out.println(age);
        System.out.println(name);
        System.out.println(para);
    }


}
