package Java.Java0712;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many columns do you want?");
        int col = input.nextInt();

        String[][] number = new String[col][];
        int numLenth = number.length;
        int temp;
        // 输入n个数字

        System.out.println("Please input " + col + " numbers:");

        // 将二维数组的值设为空格
        for (int sph = 0; sph < numLenth - 1; sph++) {
            for (int sps = 0; sps < numLenth; sps++) {
                number[sph][sps] = " ";
            }
        }
        for (int i = 0; i < numLenth; i++) {
            // 将输入的数组代入二维数组的最后
            temp = input.nextInt();
            if (temp > 10 || temp < 0) {
                i--;
                System.out.println("Error! More than 10 or less than 0.");
            } else {
                number[numLenth - 1][i] = Integer.toString(temp);
            }
            // 判断数字，并且输出所需*
            if (number[numLenth - 1][i].equals("1")) {
                for (int z = 8; z >= 8; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i].equals("2")) {
                for (int z = 8; z >= 7; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i].equals("3")) {
                for (int z = 8; z >= 6; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i].equals("4")) {
                for (int z = 8; z >= 5; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i].equals("5")) {
                for (int z = 8; z >= 4; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i].equals("6")) {
                for (int z = 8; z >= 3; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i].equals("7")) {
                for (int z = 8; z >= 2; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i].equals("8")) {
                for (int z = 8; z >= 1; z--) {
                    number[z][i] = "*";
                }
            } else if (number[numLenth - 1][i].equals("9")) {
                for (int z = 8; z >= 0; z--) {
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
