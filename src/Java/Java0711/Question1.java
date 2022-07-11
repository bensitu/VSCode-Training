package Java.Java0711;

public class Question1 {
    public static void main(String[] args) {
        int[] arr1 = { 11, 22, 33, 44, 55 };
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        int[] arr2 = { 12, 45, 98, 73, 60 };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int min = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = min;
                }
            }
        }
        System.out.println(arr2[0]);
    }
}