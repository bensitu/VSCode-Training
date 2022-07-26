package Java.Java0726.Question4;

public class Main {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            // int x = 5;
            // int y = 0;
            // int x = 10;
            // int y = 5;
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("割る数が０になっています");
        } catch (Exception e) {
            System.out.println("引数は２つの数値を指定してください");
        } finally {
            System.out.println("プログラムを終了します");
        }
    }
}
