package day7;

import java.util.Random;
import java.util.Scanner;

public class Demo7Guess1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.println(randomNum);
        guessNumber(randomNum, 3);
    }
    public static void guessNumber(int num, int countNumber) {
        System.out.println("Your number?");
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();

        for(int i = 1; i <= countNumber; i ++) {
            if(inputNumber > num) {
                System.out.println("count: " + i);
                System.out.println("Too big!");
                System.out.println("Your number?");
                inputNumber = input.nextInt();
            } else if (inputNumber < num){
                System.out.println("count: " + i);
                System.out.println("Too small");
                System.out.println("Your number?");
                inputNumber = input.nextInt();
            } else {
                System.out.println("You win! You times is: " + i + " Your number is: " + inputNumber);
                break;
            }
        }
    }
}
