package day03;

public class demo03 {
    public static void main(String[] args) {
        int x = -1;
        int y;
        if(x >= 3) {
            y = x + 1;
        } else if (-1 < x && x < 3) {
            y = 2 * x;
        } else {
            y = x;
        }
        System.out.println(y);
    }
}
