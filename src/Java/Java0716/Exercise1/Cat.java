package Java.Java0716.Exercise1;

public class Cat extends Aminal implements Skill {

    private String variety;

    public Cat(int age, String variety) {
        super(age);
        this.variety = variety;
    }

    @Override
    public void breed() {
        System.out.println("Cat can breed.");
    }

    @Override
    public void eat() {
        System.out.println("Cat can eat.");

    }

    @Override
    public void run() {
        System.out.println("Cat can run.");

    }

    public void show(){
        System.out.println("The varity is "+variety);
    }

}
