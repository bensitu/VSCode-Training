package Java.Java0725.Question6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers?");
        int num = input.nextInt();
        System.out.println("Please input numbers:");
        for (int i = 0; i < num; i++) {
            list1.add(input.nextInt());
        }
        System.out.println("Numbers are:");
        int max = 0;
        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            int temp = it.next();
            max += temp;
            System.out.print(temp + " ");
        }
        System.out.println("-----------------");
        System.out.println("Total is:" + max);

        input.close();
    }
}
