package Java.Java0707;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String val = null;
        do {
            System.out.println("Please enter your number:");
            val = input.next();
            System.out.println("You have enter the number: " + val);
            switch (val) {
                case "3":
                case "4":
                case "5":
                    System.out.println("This is Spring!");
                    break;

                case "6":
                case "7":
                case "8":
                    System.out.println("This is Summer!");
                    break;

                case "9":
                case "10":
                case "11":
                    System.out.println("This is Autumn!");
                    break;

                case "12":
                case "1":
                case "2":
                    System.out.println("This is Winter!");
                    break;

                default:
                    System.out.println("Please input the number between 1-12");
                    break;
            }

        } while (!"#".equals(val));
        System.out.println("Sysem shutdown.");
        input.close();
    }
}
