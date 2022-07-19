package Java.Java0719.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the rectangle's length:");
        double length = input.nextDouble();
        System.out.println("Please input the rectangle's width:");
        double width = input.nextDouble();
        Rectangle r1 = new Rectangle(length, width);
        System.out.println("Rectangle's area is: " + r1.getArea());
        System.out.println("Rectangle's perimeter is: " + r1.getPerimeter());
        input.close();
    }
}
