package Java.Java0714.Question1;

public class Book {
    
    int pageNum;
    int price;

    public Book(int pageNum, int price) {
        this.pageNum = pageNum;
        this.price = price;
    }

    public void show() {
        System.out.println("This book has " + this.pageNum + " pages. And the price is " + this.price + ".");
    }
}