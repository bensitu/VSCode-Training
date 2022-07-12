package Java.Java0712;

import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100 + 1);
        }
        Arrays.sort(arr1);
        System.out.println("Here's the array list:");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }
        System.out.println();
        System.out.println("Please input the numer which you want to delete:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = arr1.length;
        int[] arr2 = new int[count];
        for (int k = 0; k < arr1.length; k++) {
            if (arr1[k] != num) {
                count++;
                arr2[k] = arr1[k];
            } else {
                
            }
        }

        System.out.println("Here's the latest array list:");
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
        input.close();
    }
}
