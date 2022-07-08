package Java.Java0708;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int guessNum = (int) (Math.random() * 100 + 1);
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the number:");
        while (true) {
            int num = input.nextInt();
            if (num > 100) {
                System.out.println("Your inputted number is larger than 100. ダメ！");
            } else if (num < 0) {
                System.out.println("Your inputted number is less than 0. ダメ！");
            } else if (num < guessNum) {
                System.out.println(num + " is too small!!!");
            } else if (num > guessNum) {
                System.out.println(num + " is too large!!!");
            } else {
                System.out.println("Bingo! The guess number is " + guessNum);
                break;
            }
            System.out.println("Please input the number:");
        }
        input.close();
    }
}
