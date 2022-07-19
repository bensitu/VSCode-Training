package Java.Java0719.Exercise1;

public class Dog extends Aminal implements Skill {

    public Dog(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("Dog can eat.");

    }

    @Override
    public void run() {
        System.out.println("Cat can run.");

    }

    @Override
    public void breed() {
        System.out.println("Dog can breed.");

    }

    public void shout() {
        System.out.println("ワン！ワン！");
    }

}
