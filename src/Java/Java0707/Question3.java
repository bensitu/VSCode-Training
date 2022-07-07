package Java.Java0707;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input number A:");
        int a = input.nextInt();
        System.out.println("Please input number B:");
        int b = input.nextInt();

        if (a > 5 && a < 10 && b == 8) {
            System.out.println("Bingo!");
        } else {
            System.out.println("残念！");
        }
        System.out.println("please input number C:");
        int c = input.nextInt();
        switch (c) {
            case 3:
            case 6:
            case 9:
            System.out.println("Bingo!");
            break;

            default:
            System.out.println("残念！");
            break;
        }
        input.close();
    }
}
