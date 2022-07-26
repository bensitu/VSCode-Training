package Java.Java0725.Question9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> studentList = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input 15 names:");
        for (int i = 0; i < 15; i++) {
            studentList.put(i + 1, input.nextLine());
        }

        // studentList.sort(Comparator.naturalOrder());

        Set<?> entrySet = studentList.entrySet();
        Iterator<?> it = entrySet.iterator();
        System.out.println("Student list:");
        while (it.hasNext()) {
            Object obj = it.next();
            Map.Entry<String, Integer> entry = (Entry) obj;
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        input.close();
    }
}
