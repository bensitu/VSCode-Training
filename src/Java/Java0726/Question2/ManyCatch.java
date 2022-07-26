package Java.Java0726.Question2;

public class ManyCatch {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[5];
            System.out.println("配列に数値を代入します");
            intArray[10] = 50;
            System.out.println("配列に50を代入します");
            int num = intArray[0];
            System.out.println("割り算の結果は" + num + "です");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の要素数を超えています");
        } catch (ArithmeticException e) {
            System.out.println("０で除算はできません");
        } finally {
            System.out.println("例外処理の最後の処理です");
        }
        System.out.println("処理終了");
    }
}
