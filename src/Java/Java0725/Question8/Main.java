package Java.Java0725.Question8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> Poker = new ArrayList<>();
        String[] colors = { "♠", "♥", "♣", "♦" };
        String[] numbers = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3" };

        Poker.add("BigJoker");
        Poker.add("SmallJoker");

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                Poker.add(colors[i] + numbers[j]);
            }
        }
        Collections.shuffle(Poker);

        List<String> P1 = new ArrayList<>();
        List<String> P2 = new ArrayList<>();
        List<String> P3 = new ArrayList<>();
        List<String> rest = new ArrayList<>();

        for (int i = 0; i < Poker.size(); i++) {
            String temp = Poker.get(i);
            if (i >= 51) {
                rest.add(temp);
            } else if (i % 3 == 0) {
                P1.add(temp);
            } else if (i % 3 == 1) {
                P2.add(temp);
            } else if (i % 3 == 2) {
                P3.add(temp);
            }
        }
        Iterator<String> it1 = P1.iterator();
        Iterator<String> it2 = P2.iterator();
        Iterator<String> it3 = P3.iterator();
        Iterator<String> it4 = rest.iterator();
        System.out.print("P1:\t");
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }
        System.out.print("\nP2:\t");
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
        System.out.print("\nP3:\t");
        while (it3.hasNext()) {
            System.out.print(it3.next() + " ");
        }
        System.out.print("\nrest:\t");
        while (it4.hasNext()) {
            System.out.print(it4.next() + " ");
        }
        System.out.println("");
    }
}
