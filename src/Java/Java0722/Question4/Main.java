package Java.Java0722.Question4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
        String[] str1 = new String[set.size()];
        set.toArray(str1);

        for (String s : str1) {
            System.out.print(s + "\t");
        }

        System.out.println("\n---------------------");
        Set<String> set2 = new HashSet<>(Arrays.asList(str1));
        System.out.println(set2);
    }
}
