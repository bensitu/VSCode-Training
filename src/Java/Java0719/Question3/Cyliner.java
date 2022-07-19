package Java.Java0719.Question3;

public class Cyliner extends Solid implements SolidMethod {

    double radius;
    static final double PI = Math.PI;

    public Cyliner(double radius, double height) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double Volumn() {
        return (PI * radius * radius * height);
    }

    @Override
    public double surfaceArea() {
        return (PI * radius * radius * 2) + (height * 2 * PI * radius);
    }

    @Override
    void show() {
        System.out.println("Cyliner is created.");
    }

}
