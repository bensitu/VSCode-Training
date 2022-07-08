package Java.Java0708;

public class Question1 {
    public static void main(String[] args) {
        double thickness = 0.1;
        double Mountain_high = 8844430;
        int i = 1;
        while (thickness < Mountain_high) {
            thickness = thickness * 2;
            i++;
        }
        System.out.println((i - 1) + "回を畳む必要だ。");
    }
}