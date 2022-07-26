package Java.Java0726.Question6;

public class Main {
    public static void main(String[] args) {
        try {
            double weight = Double.parseDouble(args[0]);
            double height = Double.parseDouble(args[1]);
            // double weight = -50;
            // double height = -100;
            // double weight = 65;
            // double height = 1.7;
            System.out.println("BMI = " + getBMI(weight, height));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("２つの数値を指定してください");
        }
    }

    public static double getBMI(double weight, double height) throws IllegalArgumentException {
        if (weight < 0 || height < 0) {
            throw new IllegalArgumentException("負数を用いることはできません");
        } else {
            return weight / (height * height);
        }
    }
}
