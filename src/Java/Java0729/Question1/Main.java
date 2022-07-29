package Java.Java0729.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        System.out.println("Please input the number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int sum;
        // 数字はオーバーゼーロの時
        if (num > 0) {
            if (num > 10000) {
                arr1[0] = (num / 10000) % 10;
                arr1[1] = (num / 1000) % 10;
                arr1[2] = (num / 100) % 10;
                arr1[3] = (num / 10) % 10;
                arr1[4] = (num / 1) % 10;
                sum = arr1[0] + arr1[1] + arr1[2] + arr1[3] + arr1[4];
            } else if (num > 1000 && num < 10000) {
                arr1[0] = (num / 1000) % 10;
                arr1[1] = (num / 100) % 10;
                arr1[2] = (num / 10) % 10;
                arr1[3] = (num / 1) % 10;
                sum = arr1[0] + arr1[1] + arr1[2] + arr1[3];
            } else if (num > 100 && num < 1000) {
                arr1[0] = (num / 100) % 10;
                arr1[1] = (num / 10) % 10;
                arr1[2] = (num / 1) % 10;
                sum = arr1[0] + arr1[1] + arr1[2];
            } else if (num > 10 && num < 100) {
                arr1[0] = (num / 10) % 10;
                arr1[1] = (num / 1) % 10;
                sum = arr1[0] + arr1[1];
            } else {
                arr1[0] = num;
                arr1[1] = 0;
                sum = num;
            }
            // 数字は小なりゼーロの時
        } else if (num < 0) {
            if (num < -10000) {
                arr1[0] = (num / 10000) % 10;
                arr1[1] = (num / 1000) % 10;
                arr1[2] = (num / 100) % 10;
                arr1[3] = (num / 10) % 10;
                arr1[4] = (num / 1) % 10;
                sum = arr1[0] + arr1[1] + arr1[2] + arr1[3] + arr1[4];
            } else if (num < -10000 && num > -1000) {
                arr1[0] = (num / 1000) % 10;
                arr1[1] = (num / 100) % 10;
                arr1[2] = (num / 10) % 10;
                arr1[3] = (num / 1) % 10;
                sum = arr1[0] + arr1[1] + arr1[2] + arr1[3];
            } else if (num < -1000 && num > -100) {
                arr1[0] = (num / 100) % 10;
                arr1[1] = (num / 10) % 10;
                arr1[2] = (num / 1) % 10;
                sum = arr1[0] + arr1[1] + arr1[2];
            } else if (num < -100 && num > -10) {
                arr1[0] = (num / 10) % 10;
                arr1[1] = (num / 1) % 10;
                sum = arr1[0] + arr1[1];
            } else {
                arr1[0] = num;
                arr1[1] = 0;
                sum = num;
            }
        } else {
            sum = 0;
        }
        System.out.println(sum);
        input.close();
    }
}
