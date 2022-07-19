package Java.Java0719.Question3;

public class Cuboid extends Solid implements SolidMethod {
    double length;
    double width; 

    public Cuboid(double length, double width, double height) {
        super(height);
        this.width = width;
        this.length = length;
    }

    @Override
    public double surfaceArea() {
        return (length * width + length * height + width * height) * 2;
    }

    @Override
    public double Volumn() {
        return length * width * height;
    }

    @Override
    void show() {
        System.out.println("Cuboid is created.");
    }

}
