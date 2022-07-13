package Java.Java0713.Question3;

public class Item {
    String name;
    int price;

    public Item(String n, int p) {
        name = n;
        price = p;
    }

    public void display() {
        System.out.println(this.name + ": " + this.price);
    }
}
