package Java.Java0726.Question7;

public class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": " + price + "円";
    }
}
