package Java.Java0708;

public class Question5 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 6 == 0) {
                System.out.println(i + " は６で割り切れです。");
                num++;
            }
        }
        System.out.println(num + "個があります。");
    }
}
