package Java.Java0716.Exercise1;

public class Main {
    public static void main(String[] args) {
        Aminal cat1 = new Cat(5, "Ragdoll");
        Aminal dog1 = new Dog(3);

        cat1.breed();

        ((Dog) dog1).shout();
    }
}
