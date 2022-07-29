package Java.Java0729.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please input the 計算:");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String[] s2 = method(s1);
        int total = 0;
        switch (s2[1]) {
            case "+":
                total = Integer.parseInt(s2[0]) + Integer.parseInt(s2[1]);
                System.out.println(s2[0] + s2[2] + s2[1] + "=" + total);
                break;
            case "-":
                total = Integer.parseInt(s2[0]) - Integer.parseInt(s2[1]);
                System.out.println(s2[0] + s2[1] + s2[2] + "=" + total);
                break;
            case "*":
                total = Integer.parseInt(s2[0]) * Integer.parseInt(s2[1]);
                System.out.println(s2[0] + s2[1] + s2[2] + "=" + total);
                break;
            case "/":
                total = Integer.parseInt(s2[0]) / Integer.parseInt(s2[1]);
                System.out.println(s2[0] + s2[1] + s2[2] + "=" + total);
                break;
            default:
                break;

        }

        System.out.println(total);
        input.close();
    }

    public static String[] method(String s1) {
        if (s1.contains("+")) {
            String[] str1 = s1.split("[+]");
            // str1[2] = "+";
            return str1;
        } else if (s1.contains("-")) {
            String[] str1 = s1.split("[-]");
            // str1[2] = "-";
            return str1;
        } else if (s1.contains("*")) {
            String[] str1 = s1.split("[*]");
            // str1[2] = "*";
            return str1;
        } else if (s1.contains("/")) {
            String[] str1 = s1.split("[/]");
            // str1[2] = "/";
            return str1;
        } else {
            return null;
        }

    }
}
