package Java.Java0726.Question3;

public class Main {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            // int x = a;
            // int y = b;
            // int x = 5;
            // int y = 8;
            System.out.println(x + y);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("引数の数が足りません");
        } catch (NumberFormatException e) {
            System.out.println("引数はそれぞれ数値でなければいけません");
        } catch (Exception e) {
            System.out.println("異常が発生した");
        } finally {
            System.out.println("執行完了です");
        }

    }
}
