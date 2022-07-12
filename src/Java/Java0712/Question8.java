package Java.Java0712;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        String[][] number = new String[10][10];
        int numLenth = number.length;
        // 输入10个数字
        Scanner input = new Scanner(System.in);
        System.out.println("Please input 10 numbers:");
        // 把输入的数字放到一个数组
        String[] origin = new String[10];
        for (int a = 0; a < origin.length; a++) {
            origin[a] = input.nextLine();
        }
        // 将二维数组的值设为空格
        for (int sph = 0; sph < numLenth - 1; sph++) {
            for (int sps = 0; sps < numLenth; sps++) {
                number[sph][sps] = " ";
            }
        }
        for (int i = 0; i < numLenth; i++) {
            // 将输入的数组代入二维数组的最后
            number[numLenth - 1][i] = origin[i];
            // 判断数字，并且输出所需*
            if (number[numLenth - 1][i] == "1") {
                for (int z = 8; z >= 8; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i] == "2") {
                for (int z = 8; z >= 7; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i] == "3") {
                for (int z = 8; z >= 6; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i] == "4") {
                for (int z = 8; z >= 5; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i] == "5") {
                for (int z = 8; z >= 4; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i] == "6") {
                for (int z = 8; z >= 3; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i] == "7") {
                for (int z = 8; z >= 2; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i] == "8") {
                for (int z = 8; z >= 2; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i] == "9") {
                for (int z = 8; z > 1; z--) {
                    number[z][i] = "*";
                }
            } else {

            }

        }
        // 输出结果
        for (int x = 0; x < numLenth; x++) {
            for (int y = 0; y < numLenth; y++) {
                System.out.print(number[x][y] + " ");
            }
            System.out.println("");
        }
        System.out.println();
        input.close();
    }
}
