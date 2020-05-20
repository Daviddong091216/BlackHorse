package day7.newdemo;

import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        /*for (int i = 0; i < 100; i++) {
            System.out.println(Math.random());
        }*/
        for (int i = 0; i < 100; i++) {
            System.out.println(new Random().nextInt(111) - 100);
        }


    }
}
