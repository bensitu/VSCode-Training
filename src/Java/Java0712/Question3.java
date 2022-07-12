package Java.Java0712;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        String[][] array2d1 = { { "A", "B" }, { "C", "D" } };
        String[][] array2d2 = array2d1;
        String[][] array2d3 = array2d1.clone();
        String[][] array2d4 = { { "W", "X" }, { "Y", "Z" } };
        String[][] array2d5 = { { "A", "B" }, { "C", "D" } };

        System.out.println(Arrays.deepEquals(array2d1, array2d2));
        System.out.println(Arrays.deepEquals(array2d1, array2d3));
        System.out.println(Arrays.deepEquals(array2d1, array2d4));
        System.out.println(Arrays.deepEquals(array2d1, array2d5));

    }
}
