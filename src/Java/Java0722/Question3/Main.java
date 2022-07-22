package Java.Java0722.Question3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("123");
        set.add("456");
        set.add("789");
        set.add("AA");
        set.add("BB");
        set.add("123A");
        set.add("CC");
        set.add("DD");
        System.out.println(set);

        System.out.println("---------------------");
        ArrayList<String> arr1 = new ArrayList<>(set); // HashsetをArrayListに変える
        System.out.println(arr1);

        System.out.println("---------------------");// HashsetをTreeSetに変える
        TreeSet<String> tree = new TreeSet<>(set);
        System.out.println(tree);
    }
}
