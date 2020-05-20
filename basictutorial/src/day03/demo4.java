package day03;

public class demo4 {
    public static void main(String[] args) {
        int score = -10;
        if(score >= 70 && score <= 100) {
            System.out.println("pass");
        } else if (0 <= score && score < 70) {
            System.out.println("failure");
        } else {
            System.out.println("Wrong score!");
        }
    }
}
