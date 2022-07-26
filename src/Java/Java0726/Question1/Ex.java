package Java.Java0726.Question1;

public class Ex {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("Try");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bound!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error!");
        } finally {
            System.out.println("Finally!");
        }
    }
}
