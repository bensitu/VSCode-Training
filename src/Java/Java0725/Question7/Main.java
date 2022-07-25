package Java.Java0725.Question7;

import java.util.ArrayList;
import java.util.Comparator;
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
        Iterator<Integer> it1 = list1.iterator();
        while (it1.hasNext()) {
            int temp = it1.next();
            System.out.print(temp + " ");
        }
        // Sort方法
        System.out.println("\n----------------");
        System.out.println("After sorted:");
        list1.sort(Comparator.naturalOrder());
        Iterator<Integer> it2 = list1.iterator();
        while (it2.hasNext()) {
            int temp = it2.next();
            System.out.print(temp + " ");
        }
        System.out.println("");

        // For方法
        System.out.println("\n----------------");
        System.out.println("After sorted:");
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.size() - 1; j++) {
                int tempnum = 0;
                if (list1.get(j) > list1.get(j + 1)) {
                    tempnum = list1.get(j + 1);
                    list1.set(j + 1, list1.get(j));
                    list1.set(j, tempnum);
                }
            }
        }
        Iterator<Integer> it3 = list1.iterator();
        while (it3.hasNext()) {
            int temp = it3.next();
            System.out.print(temp + " ");
        }
        System.out.println("");
        input.close();
    }
}
