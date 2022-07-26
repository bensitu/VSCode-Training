package Java.Java0726.Question7;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(ProductManager.searchProduct("りんご"));
            System.out.println(ProductManager.searchProduct("バナナ"));
            System.out.println(ProductManager.searchProduct("メロン"));
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
    }
}
