package Java.Java0707;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        long num;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your number:");
        num = input.nextInt();
        input.close();
        if (num % 2 == 0) {
            System.out.println("You have inputted an Even number!");
        } else {
            System.out.println("You have inputted an Odd number!");
        }

        if (num < 0) {
            num = -num;
        } else {

        }

        System.out.println("The number is " + num + ".");
    }
}
