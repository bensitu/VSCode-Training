package Java.Java0720.Exercise2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String str = "Minneapolis";
        System.out.println(str.replaceAll("i", "k"));

        System.out.println("-------------------------");

        int num1 = 45;
        String str1 = Integer.toHexString(num1);
        System.out.println("45の十六進数は" + str1);
        
        System.out.println("-------------------------");

        int[] num2 = new int[10];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = (int) (Math.random() * 100 + 1);
            System.out.println(num2[i]);
        }

        System.out.println("-------------------------");

        Date date1 = new Date();
        System.out.println(date1);
    }
}
