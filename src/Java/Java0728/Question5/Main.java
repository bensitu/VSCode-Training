package Java.Java0728.Question5;

public class Main {
    public static void main(String[] args) {
        ThreadA tA = new ThreadA();
        ThreadB tB = new ThreadB();
        ThreadC tC = new ThreadC();
        tA.start();
        tB.start();
        tC.start();
    }

    static class ThreadA extends Thread {
        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadA");
                if (i % 3 == 0) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class ThreadB extends Thread {
        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadB");
                if (i % 3 == 1) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class ThreadC extends Thread {
        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadC");
                if (i % 3 == 2) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
