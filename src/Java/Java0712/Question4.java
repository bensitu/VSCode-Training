package Java.Java0712;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do hyou want?");
        int arrayNumber = input.nextInt();
        int[] arr1 = new int[arrayNumber];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Please input the number: ");
            arr1[i] = input.nextInt();
        }
        Arrays.sort(arr1);
        System.out.println("The number list is:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        input.close();
    }
}
