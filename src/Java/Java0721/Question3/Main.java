package Java.Java0721.Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank[] account = new Bank[10];
        for (int i = 0; i < account.length; i++) {
            account[i] = new Bank();
            account[i].setID(i + 1);
            account[i].setSaveMoney(0);
            account[i].setPassword((int) (100000 + Math.random() * (1000000 - 100000 + 1)));
        }
        System.out.println("ID  Password  Money");
        for (Bank acc1 : account) {
            System.out.println((acc1.getID() < 10 ? (acc1.getID() + " ") : acc1.getID()) + " " + acc1.getPassword()
                    + "     " + acc1.getSaveMoney());
        }

        // 1. ID3金額
        System.out.println("---------------------");
        System.out.println("ID3のIDを入力して下さい");
        int tempID = input.nextInt();
        System.out.println("ID3のパスワードを入力して下さい");
        int tempPw = input.nextInt();
        if (tempID != account[2].getID()) {
            System.out.println("IDエラー");
        }
        if (tempPw != account[2].getPassword()) {
            System.out.println("パスワードエラー");
        }

        System.out.println("預けたい金額を入力して下さい");
        int tempMoney = input.nextInt();
        account[2].setSaveMoney(tempMoney);
        System.out.println("預けた金額は" + tempMoney + "   今口座金額は" + account[2].getSaveMoney());

        // 2. ID5金額
        System.out.println("---------------------");
        System.out.println("ID5のIDを入力して下さい");
        tempID = input.nextInt();
        System.out.println("ID5のパスワードを入力して下さい");
        tempPw = input.nextInt();
        if (tempID != account[4].getID()) {
            System.out.println("IDエラー");
        }
        if (tempPw != account[4].getPassword()) {
            System.out.println("パスワードエラー");
        }

        System.out.println("お金を引き出したい金額を入力して下さい");
        tempMoney = input.nextInt();
        if (tempMoney > account[4].getSaveMoney()) {
            System.out.println("金額不足");
        } else {
            account[4].setSaveMoney(account[4].getSaveMoney() - tempMoney);
            System.out.println("引き出し済み");
        }

    }
}
