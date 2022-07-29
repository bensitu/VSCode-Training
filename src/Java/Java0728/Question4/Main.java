package Java.Java0728.Question4;

public class Main {
    public static void main(String[] args) {
        int status = 3;
        Thread a = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(500);

                        while (status == 3) {
                            System.out.println("Full");
                        }
                        // status--;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        });
        Thread b = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(500);
                        while (status == 0) {
                            System.out.println("Empty");
                        }
                        // status++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        });

    }
}