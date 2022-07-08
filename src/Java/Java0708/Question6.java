package Java.Java0708;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number:");
        int num = input.nextInt();
        int sum = factorial(num);
        System.out.println(sum);
        input.close();
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
