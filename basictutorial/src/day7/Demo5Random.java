package day7;

import java.util.Random;
import java.util.function.DoubleToIntFunction;

public class Demo5Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);
        for (int i = 0; i < 10; i++) {
            int num1 = r.nextInt(10) + 1;
            System.out.println(num1);
        }
    }


}
