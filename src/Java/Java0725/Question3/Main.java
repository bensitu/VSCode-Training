package Java.Java0725.Question3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("Please input 5 numbers:");
        Scanner input = new Scanner(System.in);
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        System.out.println("The numbers are:");
        System.out.println(list);

        System.out.println("The maximun number is:");
        Iterator<Integer> ite = list.iterator();
        int max = 0;

        while (ite.hasNext()) {
            int temp = ite.next();
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(max);
        input.close();
    }
}
