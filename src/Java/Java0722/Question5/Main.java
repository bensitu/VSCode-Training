package Java.Java0722.Question5;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // 1.创建HashSet集合
        HashSet<String> hs = new HashSet<>();
        // 2.添加数据到集合
        hs.add("itcast");
        hs.add("itheima");
        hs.add("javase");
        // 3. 迭代器遍历集合元素
        Iterator<String> it = hs.iterator();

        while (it.hasNext()) {
            String s = it.next();
            // System.out.println(it.next()); // 元素
            // System.out.println(this.length());// 元素长度

            System.out.println(s);
            System.out.println(s.length());
        }
    }
}
