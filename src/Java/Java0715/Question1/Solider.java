package Java.Java0715.Question1;

public class Solider extends Person {

    Solider(String name) {
        super(name);
    }

    public void Attack() {
        Buki b1 = new Buki("Gun", 50);
        b1.use();
    }

    public void Defend() {
        Armor a1 = new Armor("Shield", 100);
        a1.use();
    }

    @Override
    void run() {
        System.out.println("I'm " + this.name + ", Let's go!");

    }
}
