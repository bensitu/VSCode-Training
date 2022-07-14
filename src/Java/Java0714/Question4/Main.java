package Java.Java0714.Question4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("半径10cmの円の面積は" + circle.getArea() + "平方cmです。");

        Cylinder cylinder = new Cylinder(8, 8);
        System.out.println("半径8cmの円の面積は" + cylinder.getArea() + "平方cmです。");
        System.out.println("半径8cm、高さ8cmの円柱の体積は" + cylinder.getVolume() + "立方cmです");
    }
}
