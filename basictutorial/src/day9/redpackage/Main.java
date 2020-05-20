package day9.redpackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("David" , 100);
        manager.show();
        Member one = new Member("Ethan",10);
        one.show();
        Member two = new Member("Miley",10);
        two.show();
        Member three = new Member("Aaron",10);
        three.show();
        System.out.println("=============");
        ArrayList<Integer> redPackage = manager.send(80,3);
        manager.show();
        one.receive(redPackage);
        one.show();
        two.receive(redPackage);
        two.show();
        three.receive(redPackage);
        three.show();
    }
}
