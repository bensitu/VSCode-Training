package Java.Java0714.Question4;

public class Circle {
    double PI = 3.14;
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * PI;
    }

}
