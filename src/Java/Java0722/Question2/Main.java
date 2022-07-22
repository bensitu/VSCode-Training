package Java.Java0722.Question2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("リンゴ");
        set.add("ミカン");
        set.add("バナナ");
        set.add("ブドウ");
        System.out.println(set);
        set.remove("ミカン");

        System.out.println(set);

        System.out.println(set.contains("バナナ"));
        System.out.println(set.contains("ミカン"));
    }
}
