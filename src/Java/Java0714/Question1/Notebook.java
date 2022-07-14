package Java.Java0714.Question1;

import java.util.Scanner;

public class Notebook extends Book {
    String[] fullContent;
    String newContent;

    public Notebook(int pageNum, int price) {
        super(pageNum, price);
        fullContent = new String[pageNum];
    }

    public void addContent() {
        System.out.println("Please enter your content:");
        Scanner inputContent = new Scanner(System.in);
        this.newContent = inputContent.nextLine();
        //System.out.println(this.fullContent.length);
        // this.fullContent[0] = this.newContent;

        for (int x = 0; x < this.fullContent.length; x++) {
            if (this.fullContent[x] != null) {
                
            }
            else {
                this.fullContent[x] = this.newContent;
            }
        }
        for (int i = 0; i < this.fullContent.length; i++) {
            if (this.fullContent[i] != null) {
                System.out.println(this.fullContent[i]);
            }
        }
        inputContent.close();
    }

    public void show() {
        System.out.println("This book has " + this.pageNum + " pages. And the price is " + this.price + ".");
        System.out.println("It has below content in the notebook.");
        for (int i = 0; i < this.fullContent.length; i++) {
            if (this.fullContent[i] != null) {
                System.out.println(this.fullContent[i]);
            }
        }
    }

}
