package Java.Java0729.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please input the 計算:");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String[] str1 = s1.split("\\+|\\*|\\-|/|%");
        if (s1.startsWith("-")) {
            s1 = s1.replaceFirst("\\-", "");
            if (s1.contains("+")) {
                int total = -Integer.parseInt(str1[1]) + Integer.parseInt(str1[2]);
                System.out.println(total);
            } else if (s1.contains("-")) {
                System.out.println(str1[1] + " " + str1[2]);
                int total = -Integer.parseInt(str1[1]) - Integer.parseInt(str1[2]);
                System.out.println(total);
            } else if (s1.contains("*")) {
                int total = -Integer.parseInt(str1[1]) * Integer.parseInt(str1[2]);
                System.out.println(total);
            } else if (s1.contains("/")) {
                if (Integer.parseInt(str1[2]) == 0) {
                    int total = 0;
                    System.out.println(total);
                } else {
                    System.out.println(str1[1] + " " + str1[2]);
                    int total = -Integer.parseInt(str1[1]) / Integer.parseInt(str1[2]);
                    int Yu = -Integer.parseInt(str1[1]) % Integer.parseInt(str1[2]);
                    System.out.println(total + " 余：" + Yu);
                }
            } else {
                int total = 0;
                System.out.println(total);
            }
        } else {
            if (s1.contains("+")) {
                int total = Integer.parseInt(str1[0]) + Integer.parseInt(str1[1]);
                System.out.println(total);
            } else if (s1.contains("-")) {
                int total = Integer.parseInt(str1[0]) - Integer.parseInt(str1[1]);
                System.out.println(total);
            } else if (s1.contains("*")) {
                // String[] str1 = s1.split("[*]");
                int total = Integer.parseInt(str1[0]) * Integer.parseInt(str1[1]);
                System.out.println(total);
            } else if (s1.contains("/")) {
                if (Integer.parseInt(str1[1]) == 0) {
                    int total = 0;
                    System.out.println(total);
                } else {
                    int total = Integer.parseInt(str1[0]) / Integer.parseInt(str1[1]);
                    int Yu = Integer.parseInt(str1[0]) % Integer.parseInt(str1[1]);
                    System.out.println(total + " 余：" + Yu);
                }
            } else {
                int total = 0;
                System.out.println(total);
            }
        }
        input.close();
    }
}
