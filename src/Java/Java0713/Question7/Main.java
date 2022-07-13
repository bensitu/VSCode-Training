package Java.Java0713.Question7;

public class Main {
    public static void main(String[] args) {
        Deitei d1 = new Deitei();
        int msk1 = d1.getMenseki(12, 8, 5);

        Deitei d2 = new Deitei();
        int msk2 = d2.getMenseki(8, 4, 10);

        System.out.println("D1面積は" + msk1);
        System.out.println("D2面積は" + msk2);
    }

}
