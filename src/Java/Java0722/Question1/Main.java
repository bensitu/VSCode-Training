package Java.Java0722.Question1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array = { "リンゴ", "ミカン", "バナナ", "ブドウ" };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("---------------------");
        List<String> list = Arrays.asList(array);
        Iterator<String> iterator = list.iterator(); // 迭代器

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
