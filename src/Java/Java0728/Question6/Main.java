package Java.Java0728.Question6;

public class Main {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
    }
}

class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 53; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        char[] arr = new char[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A' + i);
            System.out.println(arr[i]);
        }
    }
}
