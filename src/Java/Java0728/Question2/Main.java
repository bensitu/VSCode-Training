package Java.Java0728.Question2;

public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        t1.start();
        t2.start();
    }

    private static class MyThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
            }
        }
    }
}
