package Java.Java0712;

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number of subjects:");
        int numSub = input.nextInt();

        int[] score = new int[numSub];
        double sum = 0;
        for (int i = 0; i < numSub; i++) {
            System.out.println("Please input subject " + (i + 1) + "'s score:");
            score[i] = input.nextInt();
            sum += score[i];
        }
        Arrays.sort(score);
        System.out.println("Max score: " + score[score.length - 1] + ".");
        System.out.println("Min score: " + score[0] + ".");
        System.out.println("Total score: " + sum);
        System.out.println("Average score: " + sum / score.length);
        input.close();
    }
}
