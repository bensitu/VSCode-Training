package Java.Java0728.Question3;

public class Main {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("Thread1 run!");
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                System.out.println("Thread2 run!");
            }
        }.start();
    }
}

class Thread1 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Thread1 Run");
    }

}

class Thread2 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Thread2 Run");
    }

}
