package Java.Java0719.Question3;

public class Cube extends Solid implements SolidMethod {
    double length;

    public Cube(double height) {
        super(height);
        this.length = height;
    }

    @Override
    public double Volumn() {
        return length * length * length;
    }

    @Override
    public double surfaceArea() {
        return length * length * 6;
    }

    @Override
    void show() {
        System.out.println("Cube is created.");
    }
}
