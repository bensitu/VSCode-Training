package Java.Java0713;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100 + 1);
            System.out.println(arr1[i]);
        }
        findMax(arr1);
        
    }

    public static void findMax(int[] arr1) {
        Arrays.sort(arr1);
        int maxNum = arr1[arr1.length - 1];
        System.out.println("Max number is " + maxNum);
    }
    public int findMin(int[] arr1){
        return arr1[0];
    }
}
