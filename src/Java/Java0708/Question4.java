package Java.Java0708;

public class Question4 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int i100 = i / 100 % 10;
            int i10 = i / 10 % 10;
            int i1 = i / 1 % 10;
            if (i100 * i100 * i100 + i10 * i10 * i10 + i1 * i1 * i1 == i) {
                System.out.println(i + " is the number.");
            }
        }
    }
}
