package Java.Java0725.Question4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(5);
        list1.add(7);
        list1.add(3);
        list1.add(2);
        list1.add(9);
        list1.add(1);

        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        for (Integer int1 : list1) {
            if (!list2.contains(int1)) {
                list2.add(int1);
            }
        }

        Iterator<Integer> ite = list2.iterator();
        while (ite.hasNext()) {
            System.out.print(ite.next() + " ");
        }
        System.out.println("");

    }
}
