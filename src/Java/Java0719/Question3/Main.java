package Java.Java0719.Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the length:");
        double length = input.nextDouble();
        System.out.println("please input the width:");
        double width = input.nextDouble();
        System.out.println("Please input the height:");
        double height = input.nextDouble();
        System.out.println("Please input the radius:");
        double radius = input.nextDouble();

        Solid cube1 = new Cube(length);
        Solid cuboid = new Cuboid(length, width, height);
        Solid cyliner = new Cyliner(radius, height);

        System.out.println("Cube's surface area is " + ((Cube) cube1).surfaceArea() + ". Volumn is "
                + ((Cube) cube1).Volumn() + ".");
        System.out.println("Cuboid's surface area is " + ((Cuboid) cuboid).surfaceArea() + ". Volumn is "
                + ((Cuboid) cuboid).Volumn() + ".");
        System.out.println("Cyliner's surface area is " + ((Cyliner) cyliner).surfaceArea() + ". Volumn is "
                + ((Cyliner) cyliner).Volumn() + ".");

        input.close();
    }
}
