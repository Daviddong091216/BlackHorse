package day9;

import java.util.ArrayList;

public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int sendMoney, int count) {
        ArrayList<Integer> redList = new ArrayList<>();
        int totalMoney = super.getMoney();
        if(totalMoney < sendMoney) {
            System.out.println("You do not have enough money!");
            return redList;
        }
        super.setMoney(totalMoney - sendMoney);
        int avg = sendMoney / count;
        int mod = sendMoney % count;
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);
        return redList;

    }
}
