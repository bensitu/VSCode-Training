package Java.Java0714.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the Book's number of pages:");
        int bookPageNum = input.nextInt();
        System.out.println("Please input the Book's price:");
        int bookPrice = input.nextInt();

        System.out.println("Please input the Notebook's number of pages:");
        int notebookPageNum = input.nextInt();
        System.out.println("Please input the Noteook's price:");
        int notebookPrice = input.nextInt();

        Book b1 = new Book(bookPageNum, bookPrice);
        Notebook nb1 = new Notebook(notebookPageNum, notebookPrice);

        int selectNum, pageCount = 0;

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Please select the number you want:");
            System.out.println("1. Add new content in notebook");
            System.out.println("2. Show the notebook information");
            System.out.println("3. Show the book information");
            System.out.println("4. Quit");
            selectNum = input.nextInt();
            switch (selectNum) {
                case 1:
                    if (pageCount < notebookPageNum) {
                        nb1.addContent();
                        pageCount++;
                    } else {
                        System.out.println("The notebook is full!");
                    }
                    break;

                case 2:
                    nb1.show();
                    break;

                case 3:
                    b1.show();
                    break;

                case 4:
                    System.out.println("System shutdown.");
                    input.close();
                    return;
            }
        }
        
    }
}
