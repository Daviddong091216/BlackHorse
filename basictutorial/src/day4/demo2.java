package day4;

public class demo2 {
    public static void main(String[] args) {
        printMethod();
    }
    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
