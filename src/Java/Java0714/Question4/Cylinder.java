package Java.Java0714.Question4;

public class Cylinder extends Circle {
    int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

}
