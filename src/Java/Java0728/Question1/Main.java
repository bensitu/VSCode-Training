package Java.Java0728.Question1;

public class Main {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        my1.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("new thread");
    }

    public void MethodA() {
        System.out.println("MethodA");
    }
}