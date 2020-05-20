package day7;

import java.util.Random;
import java.util.Scanner;

public class Demo6Guess {
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
        int count = 0;
        while(true) {
            if(inputNumber > num) {
                count += 1;
                System.out.println("count: " + count);
                if(count > countNumber-1) {
                    System.out.println("You loss...");
                    break;
                }
                System.out.println("Too big!");
                System.out.println("Your number?");
                inputNumber = input.nextInt();
            } else if (inputNumber < num){
                count += 1;
                System.out.println("count: " + count);
                if(count > countNumber-1) {
                    System.out.println("You loss...");
                    break;
                }
                System.out.println("Too small");
                System.out.println("Your number?");
                inputNumber = input.nextInt();
            } else {
                count += 1;
                System.out.println("You win! You times is: " + count + " Your number is: " + inputNumber);
                break;
            }


        }

    }
}
