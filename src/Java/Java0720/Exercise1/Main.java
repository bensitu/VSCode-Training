package Java.Java0720.Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a=?");
        double a = input.nextDouble();
        System.out.println("b=?");
        double b = input.nextDouble();
        System.out.println("θ=?");
        double x = input.nextDouble();

        System.out.println("c=" + TrigonometriFunctions(a, b, x));
        input.close();
    }

    public static double TrigonometriFunctions(double a, double b, double x) {
        return Math.sqrt(a * a + b * b - 2 * a * b * (Math.cos(Math.toRadians(x))));
    }
}
