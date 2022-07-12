package Java.Java0712;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100 + 1);
        }
        Arrays.sort(arr1);
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }
        System.out.println();

        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int k = 0; k < arr1.length / 2; k++) {
            int temp = arr2[k];
            arr2[k] = arr2[arr2.length - k - 1];
            arr2[arr2.length - k - 1] = temp;
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
    }
}
