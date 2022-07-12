package Java.Java0712;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        String[] array1 = { "A", "B", "C" };
        String[] array2 = array1;
        String[] array3 = { "X", "Y", "Z" };
        String[] array4 = { "A", "B", "C" };

        System.out.println(Arrays.equals(array1, array2));
        System.out.println(Arrays.equals(array1, array3));
        System.out.println(Arrays.equals(array1, array4));
    }
}
