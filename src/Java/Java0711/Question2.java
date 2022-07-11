package Java.Java0711;

public class Question2 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 6, 7, 8, 9, 10 };
        int[] c = new int[5];

        for (int j = 0; j < a.length; j++) {
            c[j] = a[j] + b[j];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
