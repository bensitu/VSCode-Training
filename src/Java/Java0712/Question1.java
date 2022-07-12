package Java.Java0712;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100 + 1);
        }
        int[] arr2 = arr1;
        Arrays.sort(arr2);
        System.out.println("Min = " + arr2[0]);
        System.out.println("Max = " + arr2[arr2.length - 1]);

        int evenCount = 0;
        int oddCount = 0;
        for (int j = 0; j < arr2.length; j++) {
            if (arr2[j] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even number has " + evenCount + ", Odd number has " + oddCount + ".");
    }
}
