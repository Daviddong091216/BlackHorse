package day9;

import java.util.ArrayList;

public class RedPackage {
    public static void main(String[] args) {

    Manager manager = new Manager("David",100);
    Member member1 = new Member("Ethan", 100);
    Member member2 = new Member("Miley", 100);
    Member member3 = new Member("Aaron", 100);

    manager.show();
    member1.show();
    member2.show();
    member3.show();

    ArrayList<Integer> redList = manager.send(89, 3);
    member1.receive(redList);
    member2.receive(redList);
    member3.receive(redList);
    manager.show();
    member1.show();
    member2.show();
    member3.show();


    }

}
