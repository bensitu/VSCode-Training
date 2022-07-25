package Java.Java0725.Question2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class MenuManager {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            showMenu();
            int num = input.nextInt();
            switch (num) {
                case 1:
                    while (true) {
                        dishMenu();
                        int id = input.nextInt();

                        if (id == 0) {
                            break;
                        }
                    }
                case 2:
                    showOrderedDished();
                    break;
            }
            input.close();
        }

    }

    public void searchMenu(String menu, Object mp1) {
        if (mp1.equals(menu)) {

        }
    }

    public static void showMenu() {
        System.out.println("=========Menu========");
        System.out.println("1. Order");
        System.out.println("2. Ordered dishes");
        System.out.println("Please select: ");
    }

    public static void dishMenu() {
        Map<String, Integer> mp1 = new HashMap<>();
        mp1.put("らーめん", 300);
        mp1.put("チャーハン", 500);
        mp1.put("ジュース", 350);
        mp1.put("焼肉", 800);
        mp1.put("小籠包", 550);
        Iterator<Entry<String, Integer>> it = mp1.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, Integer> entry = it.next();
            System.out.print(entry.getKey() + "\t");
            System.out.print(entry.getValue());
            System.out.println("");
        }
        System.out.println("Which one you want?");
    }

    public static void showOrderedDished() {

    }
}
