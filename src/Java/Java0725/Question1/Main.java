package Java.Java0725.Question1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("国語", 90);
        map1.put("数学", 80);
        map1.put("英語", 70);

        System.out.println(map1);
    }
}
