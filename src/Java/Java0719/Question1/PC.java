package Java.Java0716.Question1;

public class PC {
    public static void main(String[] args) {
        Mouse mou1 = new Mouse();
        Memory mem1 = new Memory();
        CardReader cr1 = new CardReader();

        mou1.connect();
        mou1.disConnect();
        mem1.connect();
        mem1.disConnect();
        cr1.connect();
        cr1.disConnect();
    }
}
