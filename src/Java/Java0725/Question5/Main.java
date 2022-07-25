package Java.Java0725.Question5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("5");
        list1.add("6");
        list1.add("7");
        list1.add("8");
        list1.add("9");
        list1.add("5");
        list1.add("7");
        list1.add("3");
        list1.add("2");
        list1.add("9");
        list1.add("1");
        list1.add("5");
        System.out.println(list1);
        Iterator<String> ite = list1.iterator();
        while (ite.hasNext()) {

            String temp = ite.next();
            if (list1.indexOf(temp) != list1.lastIndexOf(temp)) {
                ite.remove();
            }
        }
        System.out.println(list1);

    }
}
