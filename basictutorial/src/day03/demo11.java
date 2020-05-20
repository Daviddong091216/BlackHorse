package day03;

public class demo11 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("===============");
        for (int i = 0; i < 10; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
        while(true) {
            System.out.println("I love you");
        }
        //System.out.println("I");
    }
}
